/*   */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*   */ 
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\022\n\002\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult$Image;", "", "contentType", "Lio/ktor/http/ContentType;", "content", "", "<init>", "(Lio/ktor/http/ContentType;[B)V", "getContentType", "()Lio/ktor/http/ContentType;", "getContent", "()[B", "core"})
/*   */ public final class Image {
/*   */   @NotNull
/*   */   private final ContentType contentType;
/*   */   
/* 9 */   public Image(@NotNull ContentType contentType, @NotNull byte[] content) { this.contentType = contentType; this.content = content; } @NotNull private final byte[] content; @NotNull public final ContentType getContentType() { return this.contentType; } @NotNull public final byte[] getContent() { return this.content; }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\builder\ToolResult$Image.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */