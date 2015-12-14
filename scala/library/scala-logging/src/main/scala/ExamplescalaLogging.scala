// X[
//
// [warn] there was one deprecation warning; re-run with -deprecation for details
// [warn] one warning found
// [info] Running ExampleScalaLogging
// SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
// SLF4J: Defaulting to no-operation (NOP) logger implementation
// SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
// [success] Total time: 4 s, completed 2015/12/14 12:43:05
import com.typesafe.scalalogging._
// import com.typesafe.scalalogging.{Logger, LazyLogging}
import org.slf4j.LoggerFactory

object ExampleScalaLogging extends App with LazyLogging {
  override def main(args: Array[String]) {
    logger.trace("trace log")
    logger.debug("debug log")
    logger.info("info log")
    logger.warn("warn log")
    logger.error("error log")
  }
}
