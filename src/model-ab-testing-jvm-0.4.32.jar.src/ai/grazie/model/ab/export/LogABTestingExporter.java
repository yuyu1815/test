/*    */ package ai.grazie.model.ab.export;
/*    */ import ai.grazie.model.ab.record.ABTestingUserRecord;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\026R\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\013"}, d2 = {"Lai/grazie/model/ab/export/LogABTestingExporter;", "Lai/grazie/model/ab/export/ABTestingExporter;", "name", "", "(Ljava/lang/String;)V", "logger", "Lai/grazie/utils/mpp/MPPLogger;", "export", "", "record", "Lai/grazie/model/ab/record/ABTestingUserRecord;", "model-ab-testing"})
/*    */ public final class LogABTestingExporter implements ABTestingExporter {
/*    */   public LogABTestingExporter(@NotNull String name) {
/*  7 */     this.logger = LoggerFactory.INSTANCE.create("ab-testing-" + name);
/*    */   } @NotNull
/*    */   private final MPPLogger logger; public void export(@NotNull ABTestingUserRecord record) {
/* 10 */     Intrinsics.checkNotNullParameter(record, "record"); this.logger.info(new LogABTestingExporter$export$1(record)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/* 11 */   static final class LogABTestingExporter$export$1 extends Lambda implements Function0<String> { public final String invoke() { return this.$record.serialize(); }
/*    */ 
/*    */     
/*    */     LogABTestingExporter$export$1(ABTestingUserRecord $record) {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ab-testing-jvm-0.4.32.jar!\ai\grazie\model\ab\export\LogABTestingExporter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */