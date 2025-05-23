/*    */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ProjectFileStructure;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\004\b\006\020\007J \020\f\032\004\030\0010\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021H@¢\006\002\020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\n\020\013¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/FileContent;", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;", "filePath", "", "source", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;)V", "getFilePath", "()Ljava/lang/String;", "getSource", "()Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "toChatMessagePart", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*    */ @SourceDebugExtension({"SMAP\nFileContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileContent.kt\ncom/intellij/ml/llm/matterhorn/requests/builder/FileContent\n+ 2 KtUtils.kt\ncom/intellij/util/KotlinUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n19#2:19\n1#3:20\n*S KotlinDebug\n*F\n+ 1 FileContent.kt\ncom/intellij/ml/llm/matterhorn/requests/builder/FileContent\n*L\n14#1:19\n*E\n"})
/*    */ public final class FileContent implements GrazieRequest.Content {
/*    */   @NotNull
/*    */   private final String filePath;
/*    */   
/* 12 */   public FileContent(@NotNull String filePath, @Nullable ProjectFileStructure source) { this.filePath = filePath; this.source = source; } @Nullable private final ProjectFileStructure source; @NotNull public final String getFilePath() { return this.filePath; } @Nullable public final ProjectFileStructure getSource() { return this.source; } @Nullable
/*    */   public Object toChatMessagePart(@NotNull ExecutionContext context, @NotNull ModelParameters modelParameters, @NotNull Continuation $completion) {
/* 14 */     if (this.source == null); if (context.getSource() != null && context.getSource().getRoot() != null && context.getSource().getRoot().findChild(this.filePath) != null) { Object $this$asSafely$iv = context.getSource().getRoot().findChild(this.filePath); int $i$f$asSafely = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 19 */       if (!($this$asSafely$iv instanceof ProjectStructureFile)); if ((ProjectStructureFile)null != null) { ProjectStructureFile it = (ProjectStructureFile)null; int $i$a$-let-FileContent$toChatMessagePart$2 = 0; StringBuilder stringBuilder1 = new StringBuilder(), $this$toChatMessagePart_u24lambda_u241_u24lambda_u240 = stringBuilder1;
/* 20 */         int $i$a$-buildString-FileContent$toChatMessagePart$2$1 = 0;
/*    */         ProjectFileStructure.Companion.appendFileTo($this$toChatMessagePart_u24lambda_u241_u24lambda_u240, it, this.filePath);
/*    */         Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*    */         String str = stringBuilder1.toString(); }
/*    */        }
/*    */     
/*    */     new MatterhornChatMessageTextPart(str);
/*    */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\builder\FileContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */