/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020$\n\002\020\b\n\002\030\002\n\002\b\007\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\f\032\004\030\0010\0072\006\020\r\032\0020\006R'\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\0058BX\002¢\006\f\n\004\b\n\020\013\032\004\b\b\020\t¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpErrorType$Companion;", "", "<init>", "()V", "codeToTypeMap", "", "", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpErrorType;", "getCodeToTypeMap", "()Ljava/util/Map;", "codeToTypeMap$delegate", "Lkotlin/Lazy;", "fromCode", "code", "data.model"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   private final Map<Integer, GrazieHttpErrorType> getCodeToTypeMap() {
/* 79 */     Lazy lazy = GrazieHttpErrorType.access$getCodeToTypeMap$delegate$cp(); return (Map<Integer, GrazieHttpErrorType>)lazy.getValue();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final GrazieHttpErrorType fromCode(int code) {
/* 84 */     return getCodeToTypeMap().get(Integer.valueOf(code));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\GrazieHttpErrorType$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */