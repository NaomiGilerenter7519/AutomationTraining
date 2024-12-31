package org.utilities;

import io.qameta.allure.Allure;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class ReportUtilities {

    // פונקציה ליצירת שלב בדוח Allure
    public static void allureStep(String step) {
        Allure.step(step);
    }

    // פונקציה לצירוף קובץ לדוח
    public static void attachFile(String fileName, byte[] fileContent) {
        Allure.addAttachment(fileName, new ByteArrayInputStream(fileContent));
    }

    // פונקציה לצירוף טקסט לדוח
    public static void attachText(String attachmentName, String textContent) {
        Allure.addAttachment(attachmentName, new ByteArrayInputStream(textContent.getBytes(StandardCharsets.UTF_8)));
    }

}
