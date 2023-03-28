class AuthenticationException extends Exception {
    public AuthenticationException() {
        super("Неправильный пароль!");
    }
}