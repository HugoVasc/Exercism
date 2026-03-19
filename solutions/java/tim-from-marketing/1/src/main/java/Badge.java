class Badge {
    public String print(Integer id, String name, String department) {
        return (
                (id != null ? ("[" + id + "] - ") : "" )
                +
                name
                + " - " +
                (department != null ? department.toUpperCase() : "OWNER")
        );
        //throw new UnsupportedOperationException("Please implement the Badge.print() method");
    }
}
