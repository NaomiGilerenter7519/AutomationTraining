/*
package org.utilities;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.monte.media.Registry;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

import java.awt.*;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.monte.media.FormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

public class RecordUtils extends ScreenRecorder {
    public static ScreenRecorder screenRecorder;
    public String name;

    public RecordUtils(GraphicsConfiguration cfg, Rectangle captureArea, Format fileFormat,
                       Format screenFormat, Format mouseFormat, Format audioFormat, File movieFolder, String name)
            throws IOException, AWTException {
        super(cfg, captureArea, fileFormat, screenFormat, mouseFormat, audioFormat, movieFolder);
        this.name = name;
    }

    @Override
    protected File createMovieFile(Format fileFormat) throws IOException {

        if (!movieFolder.exists()) {
            movieFolder.mkdirs();
        } else if (!movieFolder.isDirectory()) {
            throw new IOException("\"" + movieFolder + "\" is not a directory.");
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        return new File(movieFolder,
                name + "-" + dateFormat.format(new Date()) + "." + Registry.getInstance().getExtension(fileFormat));
    }

    @Step
    public static void startRecord(String methodName) throws Exception {
        File file = new File("target/test-recordings/");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        Rectangle captureSize = new Rectangle(0, 0, width, height);

        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().
                getDefaultScreenDevice()
                .getDefaultConfiguration();
        screenRecorder = new RecordUtils(gc, captureSize,
                new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24, FrameRateKey,
                        Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60) {
                    @Override
                    public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                        return null;
                    }

                    @Override
                    public Object parseObject(String source, ParsePosition pos) {
                        return null;
                    }
                },
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
                null, file, methodName);
        screenRecorder.start();

    }

    public static void stopRecord() throws Exception {
        screenRecorder.stop();
    }

    @Step
    public static void saveRecord(String recordName) {
        File directory = new File("target/test-recordings/");
        MyFilenameFilter filter
                = new MyFilenameFilter(recordName);
        String[] video = directory.list(filter);

        InputStream videoAsInputStream = null;
        try {
            videoAsInputStream = com.google.common.io.Files.asByteSource(new File(directory.getAbsoluteFile() + "/" + video[0])).openStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Allure.addAttachment(recordName + "_video", "application/x-troff-msvideo", videoAsInputStream, "avi");

    }

    private static class MyFilenameFilter implements FilenameFilter {

        String initials;

        // constructor to initialize object
        public MyFilenameFilter(String initials) {
            this.initials = initials;
        }

        // overriding the accept method of FilenameFilter
        // interface
        public boolean accept(File dir, String name) {
            return name.startsWith(initials);
        }
    }
}
*/
