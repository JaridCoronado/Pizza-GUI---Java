package sample;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Card {

    private String cardtype, nameOfCardHolder;
    private long cardNumber;
    private int expDate, zipCode, secureCode, txtFileNumberCard;


    public Card(String newCardType, String newName, long newCardNum, int newExpiration, int newZip, int newSecureCode) throws Exception {
        cardtype = newCardType;
        nameOfCardHolder = newName;
        cardNumber = newCardNum;
        expDate = newExpiration;
        zipCode = newZip;
        secureCode = newSecureCode;
        setTxtFileNumberCard();
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
    public Card(int txtFileNumberCardInput) throws Exception{
        txtFileNumberCard = txtFileNumberCardInput;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileNumberCardInput - 1);
        cardtype = getUserCardFromFile(specificLine);
        nameOfCardHolder = getNameOfCardHolderFromFile(specificLine);
        cardNumber = getCardNumberFromFile(specificLine);
        expDate = getExpDateFromFile(specificLine);
        zipCode = getZipCodeFromFile(specificLine);
        secureCode = getSecureCodeFromFile(specificLine);
    }

    public String getUserCard() {

        return cardtype;
    }

    public String getNameOfCardHolder() {
        return nameOfCardHolder;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getExpDate() {
        return expDate;
    }

    public int getSecureCode() {
        return secureCode;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getTxtFileNumberCard(){
        return txtFileNumberCard;
    }

    private String getNameOfCardHolderFromFile(String fileLine) {
       String keyword = "CardHolder: ";
        int cardHolderIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(cardHolderIndex + 12 );
        nameOfCardHolder = temp.substring(0, temp.indexOf("||"));
        return nameOfCardHolder;

    }

    private long getCardNumberFromFile(String fileLine) {
        String keyword = "CardNumber: ";
        int cardNumberIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(cardNumberIndex + 12 );
        cardNumber = Long.parseLong(temp.substring(0, temp.indexOf("||")));
        return cardNumber;
    }

    private int getExpDateFromFile(String fileLine) {
        String keyword = "ExpirationDate: ";
        int expIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(expIndex + 16);
        expDate = Integer.parseInt(temp.substring(0, temp.indexOf("||")));
        return expDate;
    }

    private int getSecureCodeFromFile(String fileLine) {
        String keyword = "SecureCode: ";
        int secureCodeIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(secureCodeIndex + 12);
        secureCode = Integer.parseInt(temp.substring(0, temp.indexOf("||")));
        return secureCode;
    }

    private int getZipCodeFromFile(String fileLine) {
        String keyword = "ZipCode: ";
        int zipCodeIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(zipCodeIndex + 9);
        zipCode = Integer.parseInt(temp.substring(0, temp.indexOf("||")));
        return zipCode;
    }

    private String getUserCardFromFile(String fileLine) {
        String keyword = "UserCard: ";
        int userCardIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(userCardIndex + 10);
        cardtype = temp.substring(0, temp.indexOf("||"));
        return cardtype;
    }

    public int getTxtFileNumberCardFromFile(String fileLine){
        String keyword = "TxtFileLine: ";
        int txtFileNumberIndex = fileLine.indexOf(keyword);
        String temp = fileLine.substring(txtFileNumberIndex + 13);
        txtFileNumberCard = Integer.parseInt(temp);
        return txtFileNumberCard;
    }


    public void setUserCard(String updateUserCard) throws Exception {
        cardtype = updateUserCard;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileNumberCard);
        String keyword = "UserCard: ";
        int userCardIndex = specificLine.indexOf(keyword);
        String sectorString = specificLine.substring(userCardIndex + 10);
        String updateString = specificLine.substring(0, userCardIndex + 10) + cardtype + sectorString.substring(sectorString.indexOf("||"));
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

    public void setNameOfCardHolder(String updateUserName) throws Exception {
        nameOfCardHolder = updateUserName;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileNumberCard);
        String keyword = "CardHolder: ";
        int cardHolderIndex = specificLine.indexOf(keyword);
        String sectorString = specificLine.substring(cardHolderIndex + 12);
        String updateString = specificLine.substring(0, cardHolderIndex + 12) + nameOfCardHolder + sectorString.substring(sectorString.indexOf("||"));
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

    public void setExpDate(int expirationDate) throws Exception {
        expDate = expirationDate;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileNumberCard);
        String keyword = "ExpirationDate: ";
        int expDateIndex = specificLine.indexOf(keyword);
        String sectorString = specificLine.substring(expDateIndex + 16);
        String updateString = specificLine.substring(0, expDateIndex + 16) + expDate + sectorString.substring(sectorString.indexOf("||"));
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

    public void setCardNumber(long cardNumberinput) throws Exception {
        cardNumber = cardNumberinput;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileNumberCard);
        String keyword = "CardNumber: ";
        int cardNumberIndex = specificLine.indexOf(keyword);
        String sectorString = specificLine.substring(cardNumberIndex + 12);
        String updateString = specificLine.substring(0, cardNumberIndex + 12) + cardNumber + sectorString.substring(sectorString.indexOf("||"));
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

    public void setSecureCode(int secureCodeinput) throws Exception {
        secureCode = secureCodeinput;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileNumberCard);
        String keyword = "SecureCode: ";
        int secureCodeIndex = specificLine.indexOf(keyword);
        String sectorString = specificLine.substring(secureCodeIndex + 12);
        String updateString = specificLine.substring(0, secureCodeIndex + 12) + secureCode + sectorString.substring(sectorString.indexOf("||"));
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

    public void setZipCode(int zipCodeinput) throws Exception {
        zipCode = zipCodeinput;
        String specificLine = Files.readAllLines(Paths.get("resources/Accounts.txt")).get(txtFileNumberCard);
        String keyword = "ZipCode: ";
        int zipCodeIndex = specificLine.indexOf(keyword);
        String sectorString = specificLine.substring(zipCodeIndex + 9);
        String updateString = specificLine.substring(0, zipCodeIndex + 9) + zipCode + sectorString.substring(sectorString.indexOf("||"));
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

    private void setTxtFileNumberCard() throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("resources/Accounts.txt"));
        txtFileNumberCard = 1;
        while(reader.readLine() != null){
            txtFileNumberCard++;
        }
        reader.close();

    }
    @Override
    public String toString() {

        return ("UserCard: " + cardtype + "|| CardHolder: " + nameOfCardHolder + "|| CardNumber: " + cardNumber + "|| ExpirationDate: "+ expDate + "|| ZipCode: " + zipCode + "|| SecureCode: "+ secureCode + "|| TxtFileLine: "+ txtFileNumberCard);
    }

}