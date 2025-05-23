/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*     */ 
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\021\b\002\030\0002\0020\001B!\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tR\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\023\020\020\032\004\030\0010\007¢\006\b\n\000\032\004\b\021\020\017R\034\020\022\032\004\030\0010\003X\016¢\006\016\n\000\032\004\b\023\020\013\"\004\b\024\020\025R\021\020\026\032\0020\0038F¢\006\006\032\004\b\027\020\013¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo;", "", "existingDocument", "Lcom/intellij/openapi/editor/Document;", "path", "Ljava/nio/file/Path;", "updatedText", "", "<init>", "(Lcom/intellij/openapi/editor/Document;Ljava/nio/file/Path;Ljava/lang/String;)V", "getExistingDocument", "()Lcom/intellij/openapi/editor/Document;", "getPath", "()Ljava/nio/file/Path;", "getUpdatedText", "()Ljava/lang/String;", "initialContent", "getInitialContent", "createdDocument", "getCreatedDocument", "setCreatedDocument", "(Lcom/intellij/openapi/editor/Document;)V", "effectiveDocument", "getEffectiveDocument", "ej-core"})
/*     */ final class EditInfo
/*     */ {
/*     */   @Nullable
/*     */   private final Document existingDocument;
/*     */   @NotNull
/*     */   private final Path path;
/*     */   @NotNull
/*     */   private final String updatedText;
/*     */   @Nullable
/*     */   private final String initialContent;
/*     */   @Nullable
/*     */   private Document createdDocument;
/*     */   
/*     */   @Nullable
/*     */   public final Document getExistingDocument() {
/*     */     return this.existingDocument;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Path getPath() {
/*     */     return this.path;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getUpdatedText() {
/*     */     return this.updatedText;
/*     */   }
/*     */   
/*     */   public EditInfo(@Nullable Document existingDocument, @NotNull Path path, @NotNull String updatedText) {
/* 164 */     this.existingDocument = existingDocument;
/* 165 */     this.path = path;
/* 166 */     this.updatedText = updatedText;
/*     */     
/* 168 */     this.initialContent = (this.existingDocument != null) ? this.existingDocument.getText() : null; } @Nullable public final String getInitialContent() { return this.initialContent; }
/*     */   @Nullable
/* 170 */   public final Document getCreatedDocument() { return this.createdDocument; } public final void setCreatedDocument(@Nullable Document <set-?>) { this.createdDocument = <set-?>; }
/*     */    @NotNull
/*     */   public final Document getEffectiveDocument() {
/* 173 */     if (this.createdDocument == null) if (this.existingDocument == null) throw new IllegalStateException(("Created document must be set before accessing effective document for " + this.path).toString());   return this.createdDocument;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */