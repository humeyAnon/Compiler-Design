package Models;

/*

    Models.ScannerState.enum class - Handles the scanners state


 */

public enum EScannerState {
        START,
        IDENT,
        INTEGER,
        COMMENT,
        STRING,
        DELIM,
        ERROR,
        EOF,
}