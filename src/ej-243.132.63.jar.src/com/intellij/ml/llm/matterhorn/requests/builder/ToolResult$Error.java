/*    */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\004\b\006\020\007R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Error;", "Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult;", "message", "", "image", "Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Image;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Image;)V", "getMessage", "()Ljava/lang/String;", "getImage", "()Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Image;", "core"})
/*    */ public final class Error implements ToolResult {
/*    */   @NotNull
/*    */   private final String message;
/*    */   @Nullable
/*    */   private final ToolResult.Image image;
/*    */   
/* 13 */   public Error(@NotNull String message, @Nullable ToolResult.Image image) { this.message = message; this.image = image; } @NotNull public String getMessage() { return this.message; } @Nullable public final ToolResult.Image getImage() { return this.image; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\builder\ToolResult$Error.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */