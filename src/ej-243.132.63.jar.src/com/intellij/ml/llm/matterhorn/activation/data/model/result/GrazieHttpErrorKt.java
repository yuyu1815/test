/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.SimpleHttpHeaders;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\020\016\n\002\030\002\n\002\b\003\"\027\020\000\032\004\030\0010\001*\0020\0028F¢\006\006\032\004\b\003\020\004¨\006\005"}, d2 = {"grazieTraceId", "", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;", "getGrazieTraceId", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;)Ljava/lang/String;", "data.model"})
/*    */ public final class GrazieHttpErrorKt
/*    */ {
/*    */   @Nullable
/*    */   public static final String getGrazieTraceId(@NotNull GrazieHttpError $this$grazieTraceId) {
/* 46 */     Intrinsics.checkNotNullParameter($this$grazieTraceId, "<this>"); return SimpleHttpHeaders.get-impl($this$grazieTraceId.getHeaders-yd9Q308(), "Grazie-Trace-Id");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\GrazieHttpErrorKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */