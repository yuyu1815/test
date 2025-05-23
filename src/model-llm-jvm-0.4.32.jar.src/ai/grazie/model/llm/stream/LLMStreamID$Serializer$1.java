/*   */ package ai.grazie.model.llm.stream;
/*   */ import ai.grazie.utils.mpp.UUID;
/*   */ import kotlin.jvm.internal.Intrinsics;
/*   */ import kotlin.jvm.internal.Lambda;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lai/grazie/model/llm/stream/LLMStreamID;", "it", "", "invoke"})
/*   */ final class null extends Lambda implements Function1<String, LLMStreamID> {
/*   */   public final LLMStreamID invoke(String it) {
/* 9 */     Intrinsics.checkNotNullParameter(it, "it"); return new LLMStreamID(UUID.Companion.ofText(it));
/*   */   }
/*   */   
/*   */   public static final null INSTANCE = (null)new Object();
/*   */   
/*   */   null() {
/*   */     super(1);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\stream\LLMStreamID$Serializer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */