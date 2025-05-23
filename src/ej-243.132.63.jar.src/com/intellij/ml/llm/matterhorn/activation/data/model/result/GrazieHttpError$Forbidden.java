/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\030\0002\0020\001B\031\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError$Forbidden;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;", "message", "", "headers", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/SimpleHttpHeaders;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "data.model"})
/*    */ public final class Forbidden
/*    */   extends GrazieHttpError
/*    */ {
/*    */   private Forbidden(String message, Map headers) {
/* 16 */     super(GrazieHttpErrorType.ErrorForbidden, message, headers, (DefaultConstructorMarker)null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\GrazieHttpError$Forbidden.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */