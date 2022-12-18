package com.tongji.michelin.supplement.monostate;

/**
 * @classname Screen
 * @description This represents the screen of guard
 */
public class Screen {
    /**
     * String representing the initial screen of the guard
     */
    private static String content = "------------------------";

    public Screen() { }

    /**
     * Get the content of guard's screen
     */
    public String getContent() {
        return content;
    }

    /**
     * Set the content of guard's screen
     */
    public void setContent(String content) {
        Screen.content = content;
    }

    /**
     * Return the content of guard's screen
     */
    public void returnContent() {
        Screen.content = "------------------------";
    }

}
