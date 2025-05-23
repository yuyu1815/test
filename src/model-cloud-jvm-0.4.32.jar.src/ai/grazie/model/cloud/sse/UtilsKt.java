/*   */ package ai.grazie.model.cloud.sse;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\020\016\n\002\b\002\n\002\020\013\n\002\030\002\n\000\032\n\020\003\032\0020\004*\0020\005\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000¨\006\006"}, d2 = {"SSE_END_LINE", "", "SSE_END_SIGN", "isEnd", "", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "model-cloud"})
/*   */ public final class UtilsKt {
/*   */   public static final boolean isEnd(@NotNull ServerSentEvent $this$isEnd) {
/* 6 */     Intrinsics.checkNotNullParameter($this$isEnd, "<this>"); return Intrinsics.areEqual($this$isEnd.getData(), "end");
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public static final String SSE_END_SIGN = "end";
/*   */   @NotNull
/*   */   public static final String SSE_END_LINE = "data: end\n\n";
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\UtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */