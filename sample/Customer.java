package sample;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Customer {

    private String accountUsername, password, emailAddress;
    private String address, nameofUser, city, phoneNumber;
    private int txtFileLineNumber, cardFileLineNumber;

    /* public Customer (){

        accountUsername = "FILLER";
        password = "FILLER";
        emailAddress = "FILLER";
        address = "FILLER";
        nameofUser = "FILLER";
        phoneNumber = 999999999;
        txtFileLineNumber =99;
    } */

    public Customer(int txtFileLine) throws Exception{
        txtFileLineNumber = txtFileLine;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileLine - 1);
        accountUsername = getAccountUsernameFromFile(specificLine);
        password = getPasswordFromFile(specificLine);
        address = getAddressFromFile(specificLine);
        city = getCityFromFile(specificLine);
        nameofUser = getNameofUserFromFile(specificLine);
        phoneNumber = getPhoneNumberFromFile(specificLine);
        emailAddress = getEmailAddressFromFile(specificLine);
        cardFileLineNumber = 0;
    }
    public Customer(String Username, String Psswrd, String email, String Name, String phone) throws Exception {
        accountUsername = Username;
        password = Psswrd;
        address = "FillerAddress";
        emailAddress = email;
        nameofUser = Name;
        phoneNumber = phone;
        city = "Enter City";
        setTxtFileLineNumber();
        FileWriter insertaccount = new FileWriter("resources/Accounts.txt", true);
        BufferedReader oldfile = new BufferedReader(new FileReader("resources/Accounts.txt"));
        if(oldfile.readLine() == null){
            insertaccount.write(toString());
            insertaccount.close();
            oldfile.close();
        }else{
            String updatedLine = "\n" + toString();
            insertaccount.write(updatedLine);
            insertaccount.close();
            oldfile.close();
        }
    }

    public void setAccountUsername(String newInput) throws Exception{
        accountUsername = newInput;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileLineNumber);
        String keyword = "Username: ";
        int usernameIndex = specificLine.indexOf(keyword);
        String updateString = specificLine.substring(0, usernameIndex + 10) + accountUsername + specificLine.substring(specificLine.indexOf("||"));
        BufferedReader filereader = new BufferedReader(new FileReader("resources/Accounts.txt"));
        String oldFile = "";
        String readerString = filereader.readLine();
        while(readerString != null){
            oldFile = oldFile + readerString + System.lineSeparator();
            readerString = filereader.readLine();
        }
        String newFile = oldFile.replaceAll(specificLine, updateString);
        FileWriter rewrite = new FileWriter("resources/Accounts.txt");
        rewrite.write(newFile);
        filereader.close();
        rewrite.close();
    }

    public void setPassword(String newPsswrd) throws Exception {
        password = newPsswrd;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileLineNumber);
        String keyword = "Password: ";
        int passwordIndex = specificLine.indexOf(keyword);
        String updateString = specificLine.substring(passwordIndex, passwordIndex + 12) + password + specificLine.substring(specificLine.indexOf("||"));
        BufferedReader filereader = new BufferedReader(new FileReader("resources/Accounts.txt"));
        String oldFile = "";
        String readerString = filereader.readLine();
        while(readerString != null){
            oldFile = oldFile + readerString + System.lineSeparator();
            System.out.println(oldFile);
            readerString = filereader.readLine();
        }
        String newFile = oldFile.replaceAll(specificLine, updateString);
        System.out.print(newFile);
        FileWriter rewrite = new FileWriter("resources/Accounts.txt");
        rewrite.write(newFile);
        filereader.close();
        rewrite.close();
    }

    public void setAddress(String newAddrs) throws Exception {
        address = newAddrs;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileLineNumber -1);
        String keyword = "Address: ";
        int addressIndex = specificLine.indexOf(keyword);
        String sectorString = specificLine.substring(addressIndex + 9);
        String updateString = specificLine.substring(0, addressIndex + 9) + address + sectorString.substring(sectorString.indexOf("||"));
        BufferedReader filereader = new BufferedReader(new FileReader("resources/Accounts.txt"));
        String oldFile = "";
        String readerString = filereader.readLine();
        while(readerString != null){
            if(readerString.equals(specificLine)){
                oldFile = oldFile + updateString + System.lineSeparator();
            }else{
                oldFile = oldFile + readerString + System.lineSeparator();
            }
            readerString = filereader.readLine();
        }
        FileWriter rewrite = new FileWriter("resources/Accounts.txt");
        rewrite.write(oldFile);
        filereader.close();
        rewrite.close();
    }

    public void setEmailAddress(String newEmail) throws Exception{
        emailAddress = newEmail;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileLineNumber);
        String keyword = "Email: ";
        int emailIndex = specificLine.indexOf(keyword);
        String updateString = specificLine.substring(0, emailIndex + 12) + emailAddress + specificLine.substring(specificLine.indexOf("||"));
        BufferedReader filereader = new BufferedReader(new FileReader("resources/Accounts.txt"));
        String oldFile = "";
        String readerString = filereader.readLine();
        while(readerString != null){
            oldFile = oldFile + readerString + System.lineSeparator();
            readerString = filereader.readLine();
        }
        String newFile = oldFile.replaceAll(specificLine, updateString);
        FileWriter rewrite = new FileWriter("resources/Accounts.txt");
        rewrite.write(newFile);
        filereader.close();
        rewrite.close();
    }

    public void setPhoneNumber(String newPhone) throws Exception {
        phoneNumber = newPhone;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileLineNumber -1);
        String keyword = "PhoneNumber: ";
        int phoneNumberIndex = specificLine.indexOf(keyword);
        String sectorString = specificLine.substring(phoneNumberIndex + 12);
        String updateString = specificLine.substring(0, phoneNumberIndex + 12) + phoneNumber + sectorString.substring(sectorString.indexOf("||"));
        BufferedReader filereader = new BufferedReader(new FileReader("resources/Accounts.txt"));
        String oldFile = "";
        String readerString = filereader.readLine();
        while(readerString != null) {
            if (readerString.equals(specificLine)) {
                oldFile = oldFile + updateString + System.lineSeparator();
            } else {
                oldFile = oldFile + readerString + System.lineSeparator();
            }
            readerString = filereader.readLine();
        }
        FileWriter rewrite = new FileWriter("resources/Accounts.txt");
        rewrite.write(oldFile);
        filereader.close();
        rewrite.close();
    }

    public void setCardFileLineNumber(int newCardLine) throws Exception {
        cardFileLineNumber = newCardLine;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileLineNumber -1);
        String keyword = "CardTextLine: ";
        int cardTextLineIndex = specificLine.indexOf(keyword);
        String sectorString = specificLine.substring(cardTextLineIndex + 14);
        String updateString = specificLine.substring(0, cardTextLineIndex + 14) + cardFileLineNumber + sectorString.substring(sectorString.indexOf("||"));
        BufferedReader filereader = new BufferedReader(new FileReader("resources/Accounts.txt"));
        String oldFile = "";
        String readerString = filereader.readLine();
        while(readerString != null) {
            if (readerString.equals(specificLine)) {
                oldFile = oldFile + updateString + System.lineSeparator();
            } else {
                oldFile = oldFile + readerString + System.lineSeparator();
            }
            readerString = filereader.readLine();
        }
        FileWriter rewrite = new FileWriter("resources/Accounts.txt");
        rewrite.write(oldFile);
        filereader.close();
        rewrite.close();
    }

    public void setNameofUser(String newName) throws Exception {
        nameofUser = newName;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileLineNumber - 1);
        String keyword = "Name: ";
        int nameIndex = specificLine.indexOf(keyword);
        String sectorstring = specificLine.substring(nameIndex + 6);
        String updateString = specificLine.substring(0, nameIndex + 6) + nameofUser + sectorstring.substring(sectorstring.indexOf("||"));
        BufferedReader filereader = new BufferedReader(new FileReader("resources/Accounts.txt"));
        String oldFile = "";
        String readerString = filereader.readLine();
        while(readerString != null){
            if(readerString.equals(specificLine)){
                oldFile = oldFile + updateString + System.lineSeparator();
            }else{
                oldFile = oldFile + readerString + System.lineSeparator();
            }
            readerString = filereader.readLine();
        }
        FileWriter rewrite = new FileWriter("resources/Accounts.txt");
        rewrite.write(oldFile);
        filereader.close();
        rewrite.close();
    }
    public void setCity(String newCity) throws Exception{
        city = newCity;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileLineNumber);
        String keyword = "City: ";
        int cityIndex = specificLine.indexOf(keyword);
        String updateString = specificLine.substring(0, cityIndex + 8) + city + specificLine.substring(specificLine.indexOf("||"));
        BufferedReader filereader = new BufferedReader(new FileReader("resources/Accounts.txt"));
        String oldFile = "";
        String readerString = filereader.readLine();
        while(readerString != null){
            oldFile = oldFile + readerString + System.lineSeparator();
            readerString = filereader.readLine();
        }
        String newFile = oldFile.replaceAll(specificLine, updateString);
        FileWriter rewrite = new FileWriter("resources/Accounts.txt");
        rewrite.write(newFile);
        filereader.close();
        rewrite.close();
    }

    //reads the txt file to see where the last exact spot the file would insert the new customer information
    private void setTxtFileLineNumber() throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("resources/Accounts.txt"));
        txtFileLineNumber = 1;
        while(reader.readLine() != null){
            txtFileLineNumber++;
        }
        reader.close();
    }

    //Returns the portion of the string line that specifies the username
    private String getAccountUsernameFromFile(String fileLine){
        String keyword = "Username: ";
        int usernameIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(usernameIndex + 11 );
        accountUsername = temp.substring(0, temp.indexOf("||"));
        return accountUsername;
    }
    //Returns the portion of the string line that specifies the user's password
    private String getPasswordFromFile(String fileLine){
        String keyword = "Password: ";
        int passwordIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(passwordIndex + 11);
        password = temp.substring(0, temp.indexOf("||"));
        return password;
    }

    //Returns the portion of the string that specifies the user's  email address
    private String getEmailAddressFromFile(String fileLine){
        String keyword = "Email: ";
        int emailIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(emailIndex + 8);
        emailAddress = temp.substring(0, temp.indexOf("||"));
        return emailAddress;
    }

    private int getCardFileLineNumberFromFile(String cardFileLine){
        String keyword = "CardTextLine: ";
        int cardFileLineIndex = cardFileLine.indexOf(keyword);
        String temp = cardFileLine.substring(cardFileLineIndex + 14);
        cardFileLineNumber = Integer.parseInt(temp.substring(0, temp.indexOf("||")));
        return cardFileLineNumber;
    }

    //Returns the portion of the string that specifies the user's address
    private String getAddressFromFile(String fileLine){
        String keyword = "Address: ";
        int addressIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(addressIndex + 9);
        address = temp.substring(0, temp.indexOf("||"));
        return address;
    }
    //Returns the portion of the string that specifies the user's phone number
    private String getPhoneNumberFromFile(String fileLine){
        String keyword = "PhoneNumber: ";
        int phoneNumberIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(phoneNumberIndex + 14);
        phoneNumber = temp.substring(0, temp.indexOf("||"));
        return phoneNumber;
    }

    private String getCityFromFile(String fileLine){
        String keyword = "City: ";
        int cityIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(cityIndex +  7);
        city = temp.substring(0, temp.indexOf("||"));
        return city;
    }
    //Returns the portion of the string that specifies the user's name
    private String getNameofUserFromFile(String fileLine){
        String keyword = "Name: ";
        int nameIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(nameIndex + 6);
        nameofUser = temp.substring(0, temp.indexOf("||"));
        return nameofUser;
    }

    public int getTxtFileLineNumberFromFile(String fileLine){
        String keyword = "TextLine#: ";
        int txtFileIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(txtFileIndex + 12);
        txtFileIndex = Integer.parseInt(temp);
        return txtFileIndex;
    }


    public int  getCardFileLineNumber(){
        return cardFileLineNumber;
    }

    public String getAccountUsername(){
        return accountUsername;
    }

    public String getPassword(){
        return password;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getNameofUser(){
        return nameofUser;
    }

    public int getTxtFileLineNumber(){
        return txtFileLineNumber;
    }

    @Override
    public String toString() {
        return ("Username: " + accountUsername + "|| Password: " + password + "|| Address: " + address + "|| City: " + city + "|| Email: "+ emailAddress + "|| Name: " + nameofUser + "|| CardTextLine: " + cardFileLineNumber +"|| PhoneNumber: "+ phoneNumber + "|| TextLine#: "+ txtFileLineNumber);
    }

}