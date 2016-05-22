package com.baidu.bes.pmp


import com.baidu.bes.pmp.PMPOrderPriceCalc.{SqlOutput, LocalFileWriter, CsvOutput, SysOutConsoleWriter}

/**
 * 程序主入口
 */
object Main extends App {

  val tuStatFilePath = "/Users/baidu/work/tu_stat_month"
  val ordersFilePath = "/Users/baidu/work/orders"
  //val output = CsvOutput(SysOutConsoleWriter)
  //val output = CsvOutput(LoggerWriter)
  //val output = CsvOutput(LocalFileWriter("/Users/baidu/work/results.csv"))
  val output = SqlOutput(LocalFileWriter("/Users/baidu/work/results.sql"))
  PMPOrderPriceCalc.execute(tuStatFilePath, ordersFilePath, output)

}