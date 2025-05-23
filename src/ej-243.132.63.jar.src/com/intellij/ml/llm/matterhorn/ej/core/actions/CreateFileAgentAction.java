/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.Edit;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.util.List;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\020$\n\002\030\002\n\002\b\004\b\026\030\000 #2\0020\001:\002#$B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\036\020\024\032\0020\n2\006\020\025\032\0020\0262\006\020\027\032\0020\030H@¢\006\002\020\031J\020\020\032\032\0020\n2\006\020\t\032\0020\nH\002J&\020\033\032\016\022\004\022\0020\035\022\004\022\0020\0360\0342\022\020\037\032\016\022\004\022\0020\n\022\004\022\0020!0 J\032\020\033\032\016\022\004\022\0020\035\022\004\022\0020\0360\0342\006\020\"\032\0020\nR\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0160\003X\004¢\006\b\n\000\032\004\b\017\020\bR\024\020\020\032\0020\nXD¢\006\b\n\000\032\004\b\021\020\fR\024\020\022\032\0020\nXD¢\006\b\n\000\032\004\b\023\020\f¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CreateFileAgentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "errorCheckers", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;", "<init>", "(Ljava/util/List;)V", "getErrorCheckers", "()Ljava/util/List;", "name", "", "getName", "()Ljava/lang/String;", "arguments", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "docstring", "getDocstring", "customSignature", "getCustomSignature", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trimQuotes", "parseCreateFileArguments", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/Edit;", "", "params", "", "Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;", "input", "Companion", "FileForUpdate", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nCreateFileAgentAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateFileAgentAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/CreateFileAgentAction\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n1#2:161\n756#3,10:162\n*S KotlinDebug\n*F\n+ 1 CreateFileAgentAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/CreateFileAgentAction\n*L\n146#1:162,10\n*E\n"})
/*     */ public class CreateFileAgentAction implements AgentAction {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final List<ErrorChecker> errorCheckers;
/*     */   @NotNull
/*     */   private final String name;
/*     */   @NotNull
/*     */   private final List<Argument> arguments;
/*     */   @NotNull
/*     */   private final String docstring;
/*     */   
/*     */   @Nullable
/*  27 */   public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @NotNull private final String customSignature; @NotNull public static final String CREATE_FILE_ACTION_NAME = "create"; @NotNull public static final String FILE_ARGUMENT = "filename"; @NotNull public static final String CONTENT_ARGUMENT = "content"; @NotNull public static final String BAD_QOUTES_MESSAGE = "Do not enclose the *content* in triple quotes."; @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); } @NotNull public final List<ErrorChecker> getErrorCheckers() { return this.errorCheckers; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\005\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\t\032\0020\0052\b\020\n\032\004\030\0010\013R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\005XT¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CreateFileAgentAction$Companion;", "", "<init>", "()V", "CREATE_FILE_ACTION_NAME", "", "FILE_ARGUMENT", "CONTENT_ARGUMENT", "BAD_QOUTES_MESSAGE", "buildAIIgnoredMessage", "path", "Ljava/nio/file/Path;", "ej-core"}) public static final class Companion {
/*     */     private Companion() {} @NotNull public final String buildAIIgnoredMessage(@Nullable Path path) { return "ERROR: editing " + path + " was explicitly rejected by user. Don't try editing this file again."; } } @NotNull public String getName() { return this.name; }
/*  29 */   public CreateFileAgentAction(@NotNull List<ErrorChecker> errorCheckers) { this.errorCheckers = errorCheckers;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  40 */     this.name = "create";
/*     */     
/*  42 */     Argument[] arrayOfArgument = new Argument[2]; arrayOfArgument[0] = new Argument(
/*  43 */         "filename", 
/*  44 */         ArgumentType.STRING, 
/*  45 */         "the full path to the file to create", false, false, 24, null);
/*     */     
/*  47 */     arrayOfArgument[1] = new Argument(
/*  48 */         "content", 
/*  49 */         ArgumentType.STRING, 
/*  50 */         "content of the new created file", 
/*  51 */         true, false, 16, null);
/*     */     
/*     */     this.arguments = CollectionsKt.listOf((Object[])arrayOfArgument);
/*  54 */     this.docstring = "Create a new file with the given name and given content. \nYou can run the `create` command again to completely rewrite the file you created during the **current session**.\nDo not use line numbers in *content* parameter. Do not enclose the *content* in triple quotes.";
/*     */ 
/*     */ 
/*     */     
/*  58 */     this.customSignature = "create <filename>\n<content>"; } @NotNull public List<Argument> getArguments() { return this.arguments; } @NotNull public String getDocstring() { return this.docstring; } @NotNull public String getCustomSignature() { return this.customSignature; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\f\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0052\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\024HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CreateFileAgentAction$FileForUpdate;", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "created", "", "<init>", "(Lcom/intellij/openapi/vfs/VirtualFile;Z)V", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getCreated", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ej-core"})
/*     */   public static final class FileForUpdate { @NotNull
/*  60 */     private final VirtualFile file; private final boolean created; public FileForUpdate(@NotNull VirtualFile file, boolean created) { this.file = file; this.created = created; } @NotNull public final VirtualFile getFile() { return this.file; } public final boolean getCreated() { return this.created; } @NotNull
/*     */     public final VirtualFile component1() { return this.file; }
/*     */     public final boolean component2() { return this.created; }
/*     */     @NotNull
/*     */     public final FileForUpdate copy(@NotNull VirtualFile file, boolean created) { Intrinsics.checkNotNullParameter(file, "file");
/*     */       return new FileForUpdate(file, created); }
/*     */     @NotNull
/*     */     public String toString() { return "FileForUpdate(file=" + this.file + ", created=" + this.created + ")"; }
/*     */     public int hashCode() { result = this.file.hashCode();
/*     */       return result * 31 + Boolean.hashCode(this.created); }
/*     */     public boolean equals(@Nullable Object other) { if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof FileForUpdate))
/*     */         return false; 
/*     */       FileForUpdate fileForUpdate = (FileForUpdate)other;
/*     */       return !Intrinsics.areEqual(this.file, fileForUpdate.file) ? false : (!(this.created != fileForUpdate.created)); } }
/*  76 */   private static final VirtualFile execute$lambda$1(ExecutionAgentContext $context, String $fileName, Path $path) { VirtualFile existingFile = $context.getCurrentDir().findFileByRelativePath(StringsKt.replace$default($fileName, File.separatorChar, '/', false, 4, null));
/*  77 */     if (existingFile != null && !$context.getSessionHistory().hasCreatedFile($path.toAbsolutePath().toString())) {
/*  78 */       throw new IllegalArgumentException("ERROR: File " + $fileName + " already exists");
/*     */     }
/*  80 */     return existingFile; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final FileForUpdate execute$lambda$2(VirtualFile $existingFile, ExecutionAgentContext $context, Path $path, String $fileName) {
/*  90 */     Intrinsics.checkNotNull($path); VirtualFile createdFile = FileUtil.INSTANCE.createFileCreatingDirsIfMissing($context.getCurrentDir(), $path);
/*  91 */     if (createdFile == null) {
/*  92 */       throw new IllegalArgumentException("ERROR: Could not create " + $fileName);
/*     */     }
/*  94 */     return ($existingFile == null) ? new FileForUpdate(createdFile, true) : 
/*     */       
/*  96 */       new FileForUpdate($existingFile, false);
/*     */   }
/*     */   
/*     */   private static final Document execute$lambda$3(Ref.ObjectRef $fileForUpdate) {
/* 100 */     return FileDocumentManager.getInstance().getDocument(((FileForUpdate)$fileForUpdate.element).getFile());
/*     */   }
/*     */   
/*     */   private static final Unit execute$lambda$4() {
/* 104 */     FileDocumentManager.getInstance().saveAllDocuments();
/* 105 */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit execute$lambda$5(Ref.ObjectRef $fileForUpdate, CreateFileAgentAction this$0) {
/* 122 */     if (FileUtil.INSTANCE.isEmpty(((FileForUpdate)$fileForUpdate.element).getFile())) {
/* 123 */       ((FileForUpdate)$fileForUpdate.element).getFile().delete(this$0);
/*     */     }
/* 125 */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String trimQuotes(String name) {
/* 134 */     Intrinsics.checkNotNullExpressionValue(name.substring(1, name.length() - 1), "substring(...)"); return ((StringsKt.startsWith$default(name, "\"", false, 2, null) && StringsKt.endsWith$default(name, "\"", false, 2, null)) || (StringsKt.startsWith$default(name, "'", false, 2, null) && StringsKt.endsWith$default(name, "'", false, 2, null)) || (StringsKt.startsWith$default(name, "`", false, 2, null) && StringsKt.endsWith$default(name, "`", false, 2, null))) ? name.substring(1, name.length() - 1) : 
/* 135 */       name;
/*     */   }
/*     */   @NotNull
/*     */   public final Result<Edit, Unit> parseCreateFileArguments(@NotNull Map params) {
/*     */     String fileName;
/* 140 */     Intrinsics.checkNotNullParameter(params, "params"); if (ActionUtilsKt.tryGetNonEmptyStringValue((ParameterValue)params.get("filename")) == null) { ActionUtilsKt.tryGetNonEmptyStringValue((ParameterValue)params.get("filename")); return (Result<Edit, Unit>)ResultKt.errorResult("ERROR: No file name provided"); }
/* 141 */      if (ActionUtilsKt.tryGetStringValue((ParameterValue)params.get("content")) == null) ActionUtilsKt.tryGetStringValue((ParameterValue)params.get("content"));  String content = "";
/* 142 */     return (Result<Edit, Unit>)ResultKt.successResult(new Edit(trimQuotes(fileName), "", content));
/*     */   }
/*     */   @NotNull
/*     */   public final Result<Edit, Unit> parseCreateFileArguments(@NotNull String input) {
/* 146 */     Intrinsics.checkNotNullParameter(input, "input"); Iterable $this$dropWhile$iv = StringsKt.lines(input); int $i$f$dropWhile = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 162 */     boolean yielding$iv = false;
/* 163 */     ArrayList<Object> list$iv = new ArrayList();
/* 164 */     for (Object item$iv : $this$dropWhile$iv) {
/* 165 */       if (yielding$iv) {
/* 166 */         list$iv.add(item$iv); continue;
/* 167 */       }  String it = (String)item$iv; int $i$a$-dropWhile-CreateFileAgentAction$parseCreateFileArguments$lines$1 = 0; if (!Intrinsics.areEqual(StringsKt.trim(it).toString(), "")) {
/* 168 */         list$iv.add(item$iv);
/* 169 */         yielding$iv = true;
/*     */       } 
/* 171 */     }  List<Object> lines = list$iv;
/*     */     if (lines.isEmpty())
/*     */       return (Result<Edit, Unit>)ResultKt.errorResult("ERROR: Failed to parse file name"); 
/*     */     String fileName = trimQuotes(StringsKt.trim((String)lines.get(0)).toString());
/*     */     if (lines.size() < 2)
/*     */       return (Result<Edit, Unit>)ResultKt.successResult(new Edit(fileName, "", "")); 
/*     */     String content = CollectionsKt.joinToString$default(CollectionsKt.takeLast(lines, lines.size() - 1), "\n", null, null, 0, null, null, 62, null);
/*     */     if (StringsKt.startsWith$default(StringsKt.trim(content).toString(), "```", false, 2, null) && StringsKt.endsWith$default(StringsKt.trim(content).toString(), "```", false, 2, null))
/*     */       return (Result<Edit, Unit>)ResultKt.errorResult("ERROR: Do not enclose the *content* in triple quotes."); 
/*     */     return (Result<Edit, Unit>)ResultKt.successResult(new Edit(fileName, "", content));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation<? super String> $completion) {
/*     */     return execute$suspendImpl(this, request, context, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CreateFileAgentAction.kt", l = {66, 75, 87, 100, 120, 103, 109, 120, 120, 120, 120}, i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4"}, n = {"$this", "context", "$this", "context", "edit", "fileName", "path", "$this", "context", "edit", "fileName", "path", "fileForUpdate", "$this", "context", "edit", "fileName", "path", "fileForUpdate", "$this", "context", "edit", "fileName", "path", "fileForUpdate", "document", "$this", "context", "edit", "path", "fileForUpdate"}, m = "execute$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.CreateFileAgentAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CreateFileAgentAction$execute$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int label;
/*     */     
/*     */     CreateFileAgentAction$execute$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CreateFileAgentAction.execute$suspendImpl(CreateFileAgentAction.this, null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\CreateFileAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */