public class Cheater {
    private boolean typeCheater; // false - cheater is a man. true - cheater is a company.
    private boolean sellerOrBuyer; // false - cheater is a seller. true - cheater is a buyer.
    private boolean isCriminal; // false - there is no criminal actitvity. true - there is a criminal activity.
    private String name; // Main info about cheater. His name/surname or company name.
    private String country; // Country of cheater.
    private String state; // State(область) of cheater.
    private String adress; // Adress of cheater. City/village and more.
    private String number; // Telephone number of cheater.
    private String cheatingType; // Description of cheater's activity.
    private String addictionInfo; // Other information.

    //////////CONSTRUCTORS

    public Cheater(boolean typeCheater, boolean sellerOrBuyer, boolean isCriminal, String name, String country, String state, String adress, String number, String cheatingType, String addictionInfo) {
        this.typeCheater = typeCheater;
        this.sellerOrBuyer = sellerOrBuyer;
        this.isCriminal = isCriminal;
        this.name = name;
        this.country = country;
        this.state = state;
        this.adress = adress;
        this.number = number;
        this.cheatingType = cheatingType;
        this.addictionInfo = addictionInfo;
    }

    ///////////GETTERS MAIN

    public boolean isTypeCheater() {
        return typeCheater;
    }

    public boolean isSellerOrBuyer() {
        return sellerOrBuyer;
    }

    public boolean isCriminal() {
        return isCriminal;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getAdress() {
        return adress;
    }

    public String getNumber() {
        return number;
    }

    public String getCheatingType() {
        return cheatingType;
    }

    public String getAddictionInfo() {
        return addictionInfo;
    }
    ///////SETTERS MAIN

    public void setTypeCheater(boolean typeCheater) {
        this.typeCheater = typeCheater;
    }

    public void setSellerOrBuyer(boolean sellerOrBuyer) {
        this.sellerOrBuyer = sellerOrBuyer;
    }

    public void setCriminal(boolean criminal) {
        isCriminal = criminal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCheatingType(String cheatingType) {
        this.cheatingType = cheatingType;
    }

    public void setAddictionInfo(String addictionInfo) {
        this.addictionInfo = addictionInfo;
    }

    /////METHODS
    /* ДАННЫЕ МЕТОДЫ ПРОВЕРЯЮТ, СОДЕРЖИТ ЛИ КАЖДОЕ ПОЛЕ ТО, ЧТО МЫ ВВЕЛИ. ЕСЛИ СОДЕРЖИТ, ТО ОТПРАВЛЯЕТ TRUE.
    КОГДА БУДЕТ ПРОИЗВОДИТЬСЯ ПОИСК, БУДЕТ ЗАПУСКАТЬСЯ ВСЕ МЕТОДЫ ПО ОЧЕРЕДИ. ЕСЛИ КАКОЙ-ТО ИЗ НИХ ВЫДАЕТ TRUE, ТО ВСЯ СЛОЖНАЯ ПЕРЕМЕННАЯ Cheater, ПО КОТОРОЙ ПРОИЗОШЛА ВЫДАЧА, БУДЕТ ВЫВОДИТЬСЯ НА ЭКРАН.
    ТАК ПРЕДСТАВЛЯЕТСЯ ЭТА РЕАЛИЗАЦИЯ ВАНЬКОЙ. 123
     */
    public boolean contName(String inSearch) {
        boolean is = inSearch.contains(name);
        if (is == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contCountry(String inSearch) {
        boolean is = inSearch.contains(country);
        if (is == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contState(String inSearch) {
        boolean is = inSearch.contains(state);
        if (is == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contAdress(String inSearch) {
        boolean is = inSearch.contains(adress);
        if (is == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contNumber(String inSearch) {
        boolean is = inSearch.contains(number);
        if (is == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contCheatingType(String inSearch) {
        boolean is = inSearch.contains(cheatingType);
        if (is == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contAddictionInfo(String inSearch) {
        boolean is = inSearch.contains(addictionInfo);
        if (is == true) {
            return true;
        } else {
            return false;
        }
    }


}
