import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogObserver extends Observer{

    private final Logger logger = Logger.getLogger("MyLog");
    private FileHandler fh = null;

    public LogObserver(WR wr) {
        super(wr);

        SimpleDateFormat format = new SimpleDateFormat("M-d-y_HHmmss");
        try {
            fh = new FileHandler("log/Waehrungsumrechnungen_"
                    + format.format(Calendar.getInstance().getTime()) + ".log");
        } catch (Exception e) {
            e.printStackTrace();
        }

        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
    }

    @Override
    public void update() {
        this.logger.info(this.getString());
    }


}
