/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\r\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\b&\030\0002\0020\001B\007¢\006\004\b\002\020\003J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\004\032\0020\013H\026J\030\020\f\032\0020\r2\006\020\t\032\0020\n2\006\020\004\032\0020\013H\026J\030\020\016\032\0020\r2\006\020\017\032\0020\0202\006\020\004\032\0020\013H\026J\030\020\021\032\0020\r2\006\020\017\032\0020\0222\006\020\004\032\0020\013H\026J\016\020\007\032\0020\b2\006\020\t\032\0020\nJ\016\020\f\032\0020\r2\006\020\t\032\0020\nJ4\020\023\032\0020\r2\006\020\024\032\0020\0252!\020\026\032\035\022\023\022\0210\013¢\006\f\b\030\022\b\b\024\022\004\b\b(\004\022\004\022\0020\r0\027H\bJ\016\020\016\032\0020\r2\006\020\017\032\0020\020J\020\020\021\032\0020\r2\006\020\017\032\0020\022H\026R\022\020\004\032\0060\005j\002`\006X\004¢\006\002\n\000¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectStructureVisitorWithPathTracking;", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureVisitor;", "<init>", "()V", "path", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "enterFolder", "", "folder", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;", "", "exitFolder", "", "visitFile", "file", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureFile;", "visitBinaryFile", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile;", "withFileName", "name", "", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "core"})
/*     */ @SourceDebugExtension({"SMAP\nProjectFileStructure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectFileStructure.kt\ncom/intellij/ml/llm/matterhorn/ProjectStructureVisitorWithPathTracking\n*L\n1#1,524:1\n418#1,8:525\n418#1,8:533\n*S KotlinDebug\n*F\n+ 1 ProjectFileStructure.kt\ncom/intellij/ml/llm/matterhorn/ProjectStructureVisitorWithPathTracking\n*L\n428#1:525,8\n432#1:533,8\n*E\n"})
/*     */ public abstract class ProjectStructureVisitorWithPathTracking
/*     */   implements ProjectStructureVisitor
/*     */ {
/*     */   @NotNull
/* 389 */   private final StringBuilder path = new StringBuilder();
/*     */   
/* 391 */   public boolean enterFolder(@NotNull ProjectStructureFolder folder, @NotNull CharSequence path) { Intrinsics.checkNotNullParameter(folder, "folder"); Intrinsics.checkNotNullParameter(path, "path"); return true; }
/* 392 */   public void exitFolder(@NotNull ProjectStructureFolder folder, @NotNull CharSequence path) { Intrinsics.checkNotNullParameter(folder, "folder"); Intrinsics.checkNotNullParameter(path, "path"); }
/* 393 */   public void visitFile(@NotNull ProjectStructureFile file, @NotNull CharSequence path) { Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(path, "path"); } public void visitBinaryFile(@NotNull ProjectStructureBinaryFile file, @NotNull CharSequence path) {
/* 394 */     Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(path, "path");
/*     */   }
/*     */   public final boolean enterFolder(@NotNull ProjectStructureFolder folder) {
/* 397 */     Intrinsics.checkNotNullParameter(folder, "folder"); int len = this.path.length();
/* 398 */     if (len > 0)
/* 399 */       this.path.append("/"); 
/* 400 */     this.path.append(folder.getName());
/* 401 */     if (!enterFolder(folder, this.path)) {
/* 402 */       this.path.setLength(len);
/* 403 */       return false;
/*     */     } 
/* 405 */     return true;
/*     */   }
/*     */   
/*     */   public final void exitFolder(@NotNull ProjectStructureFolder folder) {
/* 409 */     Intrinsics.checkNotNullParameter(folder, "folder"); exitFolder(folder, this.path);
/* 410 */     int index = StringsKt.lastIndexOf$default(this.path, '/', 0, false, 6, null);
/* 411 */     if (index >= 0) {
/* 412 */       this.path.setLength(index);
/*     */     } else {
/* 414 */       StringsKt.clear(this.path);
/*     */     } 
/*     */   }
/*     */   private final void withFileName(String name, Function1 block) {
/* 418 */     int $i$f$withFileName = 0, len = this.path.length();
/* 419 */     if (len > 0) {
/* 420 */       this.path.append("/");
/*     */     }
/* 422 */     this.path.append(name);
/* 423 */     block.invoke(this.path);
/* 424 */     this.path.setLength(len);
/*     */   }
/*     */   
/*     */   public final void visitFile(@NotNull ProjectStructureFile file) {
/* 428 */     Intrinsics.checkNotNullParameter(file, "file"); ProjectStructureVisitorWithPathTracking projectStructureVisitorWithPathTracking = this; String name$iv = file.getName(); int $i$f$withFileName = 0;
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
/* 525 */     int len$iv = projectStructureVisitorWithPathTracking.path.length();
/* 526 */     if (len$iv > 0) {
/* 527 */       projectStructureVisitorWithPathTracking.path.append("/");
/*     */     }
/* 529 */     projectStructureVisitorWithPathTracking.path.append(name$iv);
/* 530 */     CharSequence path = projectStructureVisitorWithPathTracking.path; int $i$a$-withFileName-ProjectStructureVisitorWithPathTracking$visitFile$1 = 0; visitFile(file, path);
/* 531 */     projectStructureVisitorWithPathTracking.path.setLength(len$iv); } public void visitBinaryFile(@NotNull ProjectStructureBinaryFile file) { Intrinsics.checkNotNullParameter(file, "file"); ProjectStructureVisitorWithPathTracking projectStructureVisitorWithPathTracking = this; String name$iv = file.getName();
/*     */     int $i$f$withFileName = 0;
/* 533 */     int len$iv = projectStructureVisitorWithPathTracking.path.length();
/* 534 */     if (len$iv > 0) {
/* 535 */       projectStructureVisitorWithPathTracking.path.append("/");
/*     */     }
/* 537 */     projectStructureVisitorWithPathTracking.path.append(name$iv);
/* 538 */     CharSequence path = projectStructureVisitorWithPathTracking.path; int $i$a$-withFileName-ProjectStructureVisitorWithPathTracking$visitBinaryFile$1 = 0; visitBinaryFile(file, path);
/* 539 */     projectStructureVisitorWithPathTracking.path.setLength(len$iv); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectStructureVisitorWithPathTracking.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */