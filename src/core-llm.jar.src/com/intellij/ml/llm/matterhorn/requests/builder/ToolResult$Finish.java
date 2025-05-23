/*    */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Finish;", "Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult;", "<init>", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "core"})
/*    */ public final class Finish
/*    */   implements ToolResult {
/*    */   @NotNull
/*    */   public static final Finish INSTANCE = new Finish();
/*    */   
/*    */   @Nullable
/*    */   public String getMessage() {
/* 15 */     return message;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private static final String message;
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\builder\ToolResult$Finish.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */