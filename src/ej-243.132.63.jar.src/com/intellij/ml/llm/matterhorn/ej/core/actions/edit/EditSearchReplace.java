/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentSessionHistory;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.Argument;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.Result;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.AgentUtilsKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.SimpleActionRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.Error;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.ErrorChecker;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ArgumentType;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.psi.PsiDocumentManager;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.nio.file.Path;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000v\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\013\n\002\b\005\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\026\030\000 C2\0020\001:\001CB\035\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\036\020\027\032\0020\f2\006\020\030\032\0020\0312\006\020\032\032\0020\033H@¢\006\002\020\034J \020\035\032\004\030\0010\f2\006\020\030\032\0020\0312\006\020\032\032\0020\033H@¢\006\002\020\034J&\020\036\032\0020\f2\006\020\030\032\0020\0312\006\020\032\032\0020\0332\006\020\037\032\0020\006H@¢\006\002\020 J0\020!\032\0020\f2\b\020\"\032\004\030\0010#2\006\020\032\032\0020\0332\006\020\037\032\0020\0062\006\020\017\032\0020\fH@¢\006\002\020$JR\020!\032\0020\f2\f\020%\032\b\022\004\022\0020&0\0032\006\020'\032\0020(2\022\020)\032\016\022\004\022\0020\f\022\004\022\0020+0*2\006\020\032\032\0020\0332\006\020\037\032\0020\0062\b\b\002\020\017\032\0020\fH@¢\006\002\020,J<\020-\032\0020\f2\f\020.\032\b\022\004\022\0020/0\0032\006\0200\032\002012\006\0202\032\0020+2\006\0203\032\0020\0062\006\0204\032\0020\006H@¢\006\002\0205JH\0206\032\0020\f*\024\022\004\022\0020\f\022\n\022\b\022\004\022\0020/0\0030*2\006\0200\032\002012\022\020)\032\016\022\004\022\0020\f\022\004\022\0020+0*2\006\020'\032\0020(H@¢\006\002\0207JX\0208\032\024\022\004\022\0020\f\022\n\022\b\022\004\022\0020/0\0030*2\006\0209\032\0020\0332\006\0200\032\002012\022\020:\032\016\022\004\022\0020\f\022\004\022\0020+0*2\022\020)\032\016\022\004\022\0020\f\022\004\022\0020+0*H@¢\006\002\020;J:\020<\032\0020\f2\006\020=\032\0020&2\006\020>\032\0020?2\022\020)\032\016\022\004\022\0020\f\022\004\022\0020+0*2\006\020@\032\0020AH@¢\006\002\020BR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\t\020\nR\024\020\013\032\0020\fXD¢\006\b\n\000\032\004\b\r\020\016R\032\020\017\032\b\022\004\022\0020\0200\003X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\023\032\0020\fXD¢\006\b\n\000\032\004\b\024\020\016R\024\020\025\032\0020\fX\004¢\006\b\n\000\032\004\b\026\020\016¨\006D"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;", "errorCheckers", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;", "requiresExplicitFilename", "", "<init>", "(Ljava/util/List;Z)V", "getRequiresExplicitFilename", "()Z", "name", "", "getName", "()Ljava/lang/String;", "arguments", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "customSignature", "getCustomSignature", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reviewActionRequest", "doExecute", "dryRun", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doSearchReplace", "overrideParsedFileBy", "Lcom/intellij/openapi/vfs/VirtualFile;", "(Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "edits", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/Edit;", "editType", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;", "fileNameToDocument", "", "Lcom/intellij/openapi/editor/Document;", "(Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;Ljava/util/Map;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resultFromErrorMessages", "errors", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;", "project", "Lcom/intellij/openapi/project/Project;", "document", "isEmptyDiff", "hasMultipleEdits", "(Ljava/util/List;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResultMessage", "(Ljava/util/Map;Lcom/intellij/openapi/project/Project;Ljava/util/Map;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findSemanticErrors", "executionContext", "updatedDocumentCopies", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/project/Project;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatErrorMessage", "edit", "matchingResult", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult;", "agentSessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/Edit;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult;Ljava/util/Map;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nEditSearchReplace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditSearchReplace.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,799:1\n1557#2:800\n1628#2,3:801\n1557#2:804\n1628#2,3:805\n1557#2:808\n1628#2,3:809\n1557#2:812\n1628#2,3:813\n1246#2,4:818\n1863#2,2:826\n1611#2,9:839\n1863#2:848\n1864#2:850\n1620#2:851\n462#3:816\n412#3:817\n503#3,7:828\n126#4:822\n153#4,3:823\n126#4:835\n153#4,3:836\n1#5:849\n1#5:852\n*S KotlinDebug\n*F\n+ 1 EditSearchReplace.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace\n*L\n147#1:800\n147#1:801,3\n215#1:804\n215#1:805,3\n221#1:808\n221#1:809,3\n221#1:812\n221#1:813,3\n232#1:818,4\n328#1:826,2\n364#1:839,9\n364#1:848\n364#1:850\n364#1:851\n232#1:816\n232#1:817\n341#1:828,7\n306#1:822\n306#1:823,3\n341#1:835\n341#1:836,3\n364#1:849\n*E\n"})
/*     */ public class EditSearchReplace
/*     */   extends AbstractEditAction
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final boolean requiresExplicitFilename;
/*     */   @NotNull
/*     */   private final String name;
/*     */   @NotNull
/*     */   private final List<Argument> arguments;
/*     */   @NotNull
/*     */   private final String customSignature;
/*     */   @NotNull
/*     */   private final String docstring;
/*     */   
/*     */   public final boolean getRequiresExplicitFilename() {
/*  61 */     return this.requiresExplicitFilename; } @NotNull public static final String SEARCH_REPLACE_ACTION_NAME = "search_replace"; @NotNull public static final String REVIEW_MESSAGE = "Please review the changes and make sure they are correct (correct indentation, no duplicate lines, etc)."; @NotNull public static final String FILE_UPDATED_MESSAGE = "File updated."; @NotNull public static final String FILE_CREATED_MESSAGE = "File created."; @NotNull public static final String BAD_QOUTES_MESSAGE = "Do not enclose the *SEARCH/REPLACE* block or any of its components in triple quotes. Use only tags to separate the parameters."; @NotNull public static final String SEARCH_REPLACE_COMMON_DOCSTRING_PART = "Each *SEARCH* pattern must match the existing source code exactly once, line for line, character for character, including all comments, docstrings, etc.\nInclude enough lines to make code inside *SEARCH* pattern uniquely identifiable. A *SEARCH* pattern that produces multiple matches in the source code will be rejected as an error.\nDo not use line numbers in *SEARCH/REPLACE* blocks. Do not enclose the *SEARCH/REPLACE* block or any of its components in triple quotes. Use only tags to separate the parameters.\n\nIf you need to edit a file again after making changes, use the latest version of the code that includes all your modifications applied during **current session**."; @NotNull
/*  62 */   public static final String EDIT_ARGUMENT = "EDIT"; public EditSearchReplace(@NotNull List<? extends ErrorChecker> errorCheckers, boolean requiresExplicitFilename) { super(errorCheckers); this.requiresExplicitFilename = requiresExplicitFilename;
/*  63 */     this.name = "search_replace";
/*  64 */     this.arguments = CollectionsKt.listOf(
/*  65 */         new Argument(
/*  66 */           "EDIT", 
/*  67 */           ArgumentType.STRING, 
/*  68 */           "search replace pattern", false, false, 24, null));
/*     */ 
/*     */ 
/*     */     
/*  72 */     this.customSignature = "search_replace\n<EDIT>\n[<EDIT>]";
/*  73 */     StringBuilder stringBuilder1 = new StringBuilder(), stringBuilder2 = stringBuilder1; EditSearchReplace editSearchReplace = this; int $i$a$-buildString-EditSearchReplace$docstring$1 = 0;
/*  74 */     int numSections = this.requiresExplicitFilename ? 3 : 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  80 */     Intrinsics.checkNotNullExpressionValue(stringBuilder2.append("Applies edits to the code. The edits must be described with *SEARCH/REPLACE* blocks enclosed in XML tags `<EDITN>`, where `N` represents the sequence number of *SEARCH/REPLACE* block.\nIt's acceptable to add multiple *SEARCH/REPLACE* sections if you need to change multiple parts of the file.\n*SEARCH/REPLACE block* Rules:\n\nEvery *SEARCH/REPLACE block* must contain " + numSections + " sections, each enclosed in XML tags:"), "append(...)"); Intrinsics.checkNotNullExpressionValue(stringBuilder2.append("Applies edits to the code. The edits must be described with *SEARCH/REPLACE* blocks enclosed in XML tags `<EDITN>`, where `N` represents the sequence number of *SEARCH/REPLACE* block.\nIt's acceptable to add multiple *SEARCH/REPLACE* sections if you need to change multiple parts of the file.\n*SEARCH/REPLACE block* Rules:\n\nEvery *SEARCH/REPLACE block* must contain " + numSections + " sections, each enclosed in XML tags:").append('\n'), "append(...)"); stringBuilder2.append("Applies edits to the code. The edits must be described with *SEARCH/REPLACE* blocks enclosed in XML tags `<EDITN>`, where `N` represents the sequence number of *SEARCH/REPLACE* block.\nIt's acceptable to add multiple *SEARCH/REPLACE* sections if you need to change multiple parts of the file.\n*SEARCH/REPLACE block* Rules:\n\nEvery *SEARCH/REPLACE block* must contain " + numSections + " sections, each enclosed in XML tags:").append('\n');
/*     */     
/*  82 */     if (this.requiresExplicitFilename) {
/*  83 */       Intrinsics.checkNotNullExpressionValue(stringBuilder2.append("- `<FILE_PATH>`: The full path of the file that will be modified."), "append(...)"); Intrinsics.checkNotNullExpressionValue(stringBuilder2.append("- `<FILE_PATH>`: The full path of the file that will be modified.").append('\n'), "append(...)"); stringBuilder2.append("- `<FILE_PATH>`: The full path of the file that will be modified.").append('\n');
/*     */     } 
/*     */     
/*  86 */     Intrinsics.checkNotNullExpressionValue(stringBuilder2.append("- `<SEARCH>`: A continuous, yet concise block of lines to search for in the existing source code (*SEARCH* pattern). If this section is empty, the lines from `<REPLACE>` will be added to the end of the file.\n- `<REPLACE>`: The lines to replace the existing code found using `<SEARCH>`. If this section is empty, the lines specified in `<SEARCH>` will be removed.\nAll of these sections must be included in each *SEARCH/REPLACE* block. \n\nEach *SEARCH* pattern must match the existing source code exactly once, line for line, character for character, including all comments, docstrings, etc.\nInclude enough lines to make code inside *SEARCH* pattern uniquely identifiable. A *SEARCH* pattern that produces multiple matches in the source code will be rejected as an error.\nDo not use line numbers in *SEARCH/REPLACE* blocks. Do not enclose the *SEARCH/REPLACE* block or any of its components in triple quotes. Use only tags to separate the parameters.\n\nIf you need to edit a file again after making changes, use the latest version of the code that includes all your modifications applied during **current session**."), "append(...)"); Intrinsics.checkNotNullExpressionValue(stringBuilder2.append("- `<SEARCH>`: A continuous, yet concise block of lines to search for in the existing source code (*SEARCH* pattern). If this section is empty, the lines from `<REPLACE>` will be added to the end of the file.\n- `<REPLACE>`: The lines to replace the existing code found using `<SEARCH>`. If this section is empty, the lines specified in `<SEARCH>` will be removed.\nAll of these sections must be included in each *SEARCH/REPLACE* block. \n\nEach *SEARCH* pattern must match the existing source code exactly once, line for line, character for character, including all comments, docstrings, etc.\nInclude enough lines to make code inside *SEARCH* pattern uniquely identifiable. A *SEARCH* pattern that produces multiple matches in the source code will be rejected as an error.\nDo not use line numbers in *SEARCH/REPLACE* blocks. Do not enclose the *SEARCH/REPLACE* block or any of its components in triple quotes. Use only tags to separate the parameters.\n\nIf you need to edit a file again after making changes, use the latest version of the code that includes all your modifications applied during **current session**.").append('\n'), "append(...)"); stringBuilder2.append("- `<SEARCH>`: A continuous, yet concise block of lines to search for in the existing source code (*SEARCH* pattern). If this section is empty, the lines from `<REPLACE>` will be added to the end of the file.\n- `<REPLACE>`: The lines to replace the existing code found using `<SEARCH>`. If this section is empty, the lines specified in `<SEARCH>` will be removed.\nAll of these sections must be included in each *SEARCH/REPLACE* block. \n\nEach *SEARCH* pattern must match the existing source code exactly once, line for line, character for character, including all comments, docstrings, etc.\nInclude enough lines to make code inside *SEARCH* pattern uniquely identifiable. A *SEARCH* pattern that produces multiple matches in the source code will be rejected as an error.\nDo not use line numbers in *SEARCH/REPLACE* blocks. Do not enclose the *SEARCH/REPLACE* block or any of its components in triple quotes. Use only tags to separate the parameters.\n\nIf you need to edit a file again after making changes, use the latest version of the code that includes all your modifications applied during **current session**.").append('\n');
/*     */ 
/*     */     
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */ 
/*     */     
/*  92 */     editSearchReplace.docstring = stringBuilder1.toString(); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String getName() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public List<Argument> getArguments() {
/*     */     return this.arguments;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object doExecute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, boolean dryRun, @NotNull Continuation<? super String> $completion) {
/* 107 */     boolean bool = this.requiresExplicitFilename;
/* 108 */     context.getCurrentScreenPosition();
/* 109 */     if (bool == true) {  }
/*     */     else { throw new NoWhenBranchMatchedException(); }
/* 111 */      VirtualFile currentFile = !bool ? ((context.getCurrentScreenPosition() != null) ? context.getCurrentScreenPosition().getFile() : null) : (VirtualFile)"JD-Core does not support Kotlin"; if (request instanceof SimpleActionRequest) {
/* 112 */       return doSearchReplace(
/* 113 */           currentFile, 
/* 114 */           context, 
/* 115 */           dryRun, (
/* 116 */           (SimpleActionRequest)request).getArguments(), $completion);
/*     */     }
/*     */     
/* 119 */     throw new AssertionError("Invalid request type");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String getCustomSignature() {
/*     */     return this.customSignature;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String getDocstring() {
/*     */     return this.docstring;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object doSearchReplace(@Nullable VirtualFile overrideParsedFileBy, @NotNull ExecutionAgentContext context, boolean dryRun, @NotNull String arguments, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$doSearchReplace$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$doSearchReplace$1
/*     */     //   13: astore #20
/*     */     //   15: aload #20
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #20
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$doSearchReplace$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #20
/*     */     //   53: aload #20
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #19
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #21
/*     */     //   65: aload #20
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 976, 0 -> 104, 1 -> 419, 2 -> 621, 3 -> 811, 4 -> 968
/*     */     //   104: aload #19
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: ldc 'Edit'
/*     */     //   111: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Edit : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*     */     //   114: aload_2
/*     */     //   115: invokestatic emitMetadata : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V
/*     */     //   118: nop
/*     */     //   119: nop
/*     */     //   120: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$Companion;
/*     */     //   123: aload #4
/*     */     //   125: aload_1
/*     */     //   126: invokestatic access$parseSearchReplace : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$Companion;Ljava/lang/String;Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;
/*     */     //   129: astore #6
/*     */     //   131: goto -> 155
/*     */     //   134: astore #7
/*     */     //   136: aload #7
/*     */     //   138: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   141: aload #4
/*     */     //   143: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   148: aconst_null
/*     */     //   149: iconst_1
/*     */     //   150: aconst_null
/*     */     //   151: invokestatic trimMargin$default : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   154: areturn
/*     */     //   155: aload #6
/*     */     //   157: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult$Error
/*     */     //   160: ifeq -> 172
/*     */     //   163: aload #6
/*     */     //   165: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult$Error
/*     */     //   168: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   171: areturn
/*     */     //   172: aload #6
/*     */     //   174: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.actions.edit.SearchReplaceParseResult.Success'
/*     */     //   177: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   180: aload #6
/*     */     //   182: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult$Success
/*     */     //   185: pop
/*     */     //   186: new java/util/LinkedHashMap
/*     */     //   189: dup
/*     */     //   190: invokespecial <init> : ()V
/*     */     //   193: checkcast java/util/Map
/*     */     //   196: astore #7
/*     */     //   198: aload #6
/*     */     //   200: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult$Success
/*     */     //   203: invokevirtual getEdits : ()Ljava/util/List;
/*     */     //   206: checkcast java/lang/Iterable
/*     */     //   209: astore #9
/*     */     //   211: iconst_0
/*     */     //   212: istore #10
/*     */     //   214: aload #9
/*     */     //   216: astore #11
/*     */     //   218: new java/util/ArrayList
/*     */     //   221: dup
/*     */     //   222: aload #9
/*     */     //   224: bipush #10
/*     */     //   226: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   229: invokespecial <init> : (I)V
/*     */     //   232: checkcast java/util/Collection
/*     */     //   235: astore #12
/*     */     //   237: iconst_0
/*     */     //   238: istore #13
/*     */     //   240: aload #11
/*     */     //   242: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   247: astore #14
/*     */     //   249: aload #14
/*     */     //   251: invokeinterface hasNext : ()Z
/*     */     //   256: ifeq -> 299
/*     */     //   259: aload #14
/*     */     //   261: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   266: astore #15
/*     */     //   268: aload #12
/*     */     //   270: aload #15
/*     */     //   272: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/Edit
/*     */     //   275: astore #16
/*     */     //   277: astore #18
/*     */     //   279: iconst_0
/*     */     //   280: istore #17
/*     */     //   282: aload #16
/*     */     //   284: invokevirtual getFileName : ()Ljava/lang/String;
/*     */     //   287: aload #18
/*     */     //   289: swap
/*     */     //   290: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   295: pop
/*     */     //   296: goto -> 249
/*     */     //   299: aload #12
/*     */     //   301: checkcast java/util/List
/*     */     //   304: nop
/*     */     //   305: checkcast java/lang/Iterable
/*     */     //   308: invokestatic distinct : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   311: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   316: astore #8
/*     */     //   318: aload #8
/*     */     //   320: invokeinterface hasNext : ()Z
/*     */     //   325: ifeq -> 886
/*     */     //   328: aload #8
/*     */     //   330: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   335: checkcast java/lang/String
/*     */     //   338: astore #9
/*     */     //   340: aload #9
/*     */     //   342: aload_2
/*     */     //   343: iconst_0
/*     */     //   344: aload #20
/*     */     //   346: iconst_4
/*     */     //   347: aconst_null
/*     */     //   348: aload #20
/*     */     //   350: aload_0
/*     */     //   351: putfield L$0 : Ljava/lang/Object;
/*     */     //   354: aload #20
/*     */     //   356: aload_2
/*     */     //   357: putfield L$1 : Ljava/lang/Object;
/*     */     //   360: aload #20
/*     */     //   362: aload #4
/*     */     //   364: putfield L$2 : Ljava/lang/Object;
/*     */     //   367: aload #20
/*     */     //   369: aload #6
/*     */     //   371: putfield L$3 : Ljava/lang/Object;
/*     */     //   374: aload #20
/*     */     //   376: aload #7
/*     */     //   378: putfield L$4 : Ljava/lang/Object;
/*     */     //   381: aload #20
/*     */     //   383: aload #8
/*     */     //   385: putfield L$5 : Ljava/lang/Object;
/*     */     //   388: aload #20
/*     */     //   390: aload #9
/*     */     //   392: putfield L$6 : Ljava/lang/Object;
/*     */     //   395: aload #20
/*     */     //   397: iload_3
/*     */     //   398: putfield Z$0 : Z
/*     */     //   401: aload #20
/*     */     //   403: iconst_1
/*     */     //   404: putfield label : I
/*     */     //   407: invokestatic smartLocateFile$default : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   410: dup
/*     */     //   411: aload #21
/*     */     //   413: if_acmpne -> 500
/*     */     //   416: aload #21
/*     */     //   418: areturn
/*     */     //   419: aload #20
/*     */     //   421: getfield Z$0 : Z
/*     */     //   424: istore_3
/*     */     //   425: aload #20
/*     */     //   427: getfield L$6 : Ljava/lang/Object;
/*     */     //   430: checkcast java/lang/String
/*     */     //   433: astore #9
/*     */     //   435: aload #20
/*     */     //   437: getfield L$5 : Ljava/lang/Object;
/*     */     //   440: checkcast java/util/Iterator
/*     */     //   443: astore #8
/*     */     //   445: aload #20
/*     */     //   447: getfield L$4 : Ljava/lang/Object;
/*     */     //   450: checkcast java/util/Map
/*     */     //   453: astore #7
/*     */     //   455: aload #20
/*     */     //   457: getfield L$3 : Ljava/lang/Object;
/*     */     //   460: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult
/*     */     //   463: astore #6
/*     */     //   465: aload #20
/*     */     //   467: getfield L$2 : Ljava/lang/Object;
/*     */     //   470: checkcast java/lang/String
/*     */     //   473: astore #4
/*     */     //   475: aload #20
/*     */     //   477: getfield L$1 : Ljava/lang/Object;
/*     */     //   480: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   483: astore_2
/*     */     //   484: aload #20
/*     */     //   486: getfield L$0 : Ljava/lang/Object;
/*     */     //   489: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace
/*     */     //   492: astore_0
/*     */     //   493: aload #19
/*     */     //   495: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   498: aload #19
/*     */     //   500: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   503: astore #10
/*     */     //   505: aload #10
/*     */     //   507: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   510: ifeq -> 527
/*     */     //   513: aload #10
/*     */     //   515: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   518: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   521: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   526: areturn
/*     */     //   527: aload #10
/*     */     //   529: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.Result.Ok<com.intellij.openapi.vfs.VirtualFile>'
/*     */     //   532: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   535: aload #10
/*     */     //   537: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   540: pop
/*     */     //   541: aload #10
/*     */     //   543: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;)Lkotlin/jvm/functions/Function0;
/*     */     //   548: aload #20
/*     */     //   550: aload #20
/*     */     //   552: aload_0
/*     */     //   553: putfield L$0 : Ljava/lang/Object;
/*     */     //   556: aload #20
/*     */     //   558: aload_2
/*     */     //   559: putfield L$1 : Ljava/lang/Object;
/*     */     //   562: aload #20
/*     */     //   564: aload #4
/*     */     //   566: putfield L$2 : Ljava/lang/Object;
/*     */     //   569: aload #20
/*     */     //   571: aload #6
/*     */     //   573: putfield L$3 : Ljava/lang/Object;
/*     */     //   576: aload #20
/*     */     //   578: aload #7
/*     */     //   580: putfield L$4 : Ljava/lang/Object;
/*     */     //   583: aload #20
/*     */     //   585: aload #8
/*     */     //   587: putfield L$5 : Ljava/lang/Object;
/*     */     //   590: aload #20
/*     */     //   592: aload #9
/*     */     //   594: putfield L$6 : Ljava/lang/Object;
/*     */     //   597: aload #20
/*     */     //   599: iload_3
/*     */     //   600: putfield Z$0 : Z
/*     */     //   603: aload #20
/*     */     //   605: iconst_2
/*     */     //   606: putfield label : I
/*     */     //   609: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   612: dup
/*     */     //   613: aload #21
/*     */     //   615: if_acmpne -> 702
/*     */     //   618: aload #21
/*     */     //   620: areturn
/*     */     //   621: aload #20
/*     */     //   623: getfield Z$0 : Z
/*     */     //   626: istore_3
/*     */     //   627: aload #20
/*     */     //   629: getfield L$6 : Ljava/lang/Object;
/*     */     //   632: checkcast java/lang/String
/*     */     //   635: astore #9
/*     */     //   637: aload #20
/*     */     //   639: getfield L$5 : Ljava/lang/Object;
/*     */     //   642: checkcast java/util/Iterator
/*     */     //   645: astore #8
/*     */     //   647: aload #20
/*     */     //   649: getfield L$4 : Ljava/lang/Object;
/*     */     //   652: checkcast java/util/Map
/*     */     //   655: astore #7
/*     */     //   657: aload #20
/*     */     //   659: getfield L$3 : Ljava/lang/Object;
/*     */     //   662: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult
/*     */     //   665: astore #6
/*     */     //   667: aload #20
/*     */     //   669: getfield L$2 : Ljava/lang/Object;
/*     */     //   672: checkcast java/lang/String
/*     */     //   675: astore #4
/*     */     //   677: aload #20
/*     */     //   679: getfield L$1 : Ljava/lang/Object;
/*     */     //   682: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   685: astore_2
/*     */     //   686: aload #20
/*     */     //   688: getfield L$0 : Ljava/lang/Object;
/*     */     //   691: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace
/*     */     //   694: astore_0
/*     */     //   695: aload #19
/*     */     //   697: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   700: aload #19
/*     */     //   702: checkcast com/intellij/openapi/editor/Document
/*     */     //   705: dup
/*     */     //   706: ifnonnull -> 718
/*     */     //   709: pop
/*     */     //   710: aload #9
/*     */     //   712: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   717: areturn
/*     */     //   718: astore #11
/*     */     //   720: aload #7
/*     */     //   722: aload #9
/*     */     //   724: aload #11
/*     */     //   726: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   731: pop
/*     */     //   732: aload #11
/*     */     //   734: <illegal opcode> invoke : (Lcom/intellij/openapi/editor/Document;)Lkotlin/jvm/functions/Function0;
/*     */     //   739: aload #20
/*     */     //   741: aload #20
/*     */     //   743: aload_0
/*     */     //   744: putfield L$0 : Ljava/lang/Object;
/*     */     //   747: aload #20
/*     */     //   749: aload_2
/*     */     //   750: putfield L$1 : Ljava/lang/Object;
/*     */     //   753: aload #20
/*     */     //   755: aload #4
/*     */     //   757: putfield L$2 : Ljava/lang/Object;
/*     */     //   760: aload #20
/*     */     //   762: aload #6
/*     */     //   764: putfield L$3 : Ljava/lang/Object;
/*     */     //   767: aload #20
/*     */     //   769: aload #7
/*     */     //   771: putfield L$4 : Ljava/lang/Object;
/*     */     //   774: aload #20
/*     */     //   776: aload #8
/*     */     //   778: putfield L$5 : Ljava/lang/Object;
/*     */     //   781: aload #20
/*     */     //   783: aconst_null
/*     */     //   784: putfield L$6 : Ljava/lang/Object;
/*     */     //   787: aload #20
/*     */     //   789: iload_3
/*     */     //   790: putfield Z$0 : Z
/*     */     //   793: aload #20
/*     */     //   795: iconst_3
/*     */     //   796: putfield label : I
/*     */     //   799: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   802: dup
/*     */     //   803: aload #21
/*     */     //   805: if_acmpne -> 882
/*     */     //   808: aload #21
/*     */     //   810: areturn
/*     */     //   811: aload #20
/*     */     //   813: getfield Z$0 : Z
/*     */     //   816: istore_3
/*     */     //   817: aload #20
/*     */     //   819: getfield L$5 : Ljava/lang/Object;
/*     */     //   822: checkcast java/util/Iterator
/*     */     //   825: astore #8
/*     */     //   827: aload #20
/*     */     //   829: getfield L$4 : Ljava/lang/Object;
/*     */     //   832: checkcast java/util/Map
/*     */     //   835: astore #7
/*     */     //   837: aload #20
/*     */     //   839: getfield L$3 : Ljava/lang/Object;
/*     */     //   842: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult
/*     */     //   845: astore #6
/*     */     //   847: aload #20
/*     */     //   849: getfield L$2 : Ljava/lang/Object;
/*     */     //   852: checkcast java/lang/String
/*     */     //   855: astore #4
/*     */     //   857: aload #20
/*     */     //   859: getfield L$1 : Ljava/lang/Object;
/*     */     //   862: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   865: astore_2
/*     */     //   866: aload #20
/*     */     //   868: getfield L$0 : Ljava/lang/Object;
/*     */     //   871: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace
/*     */     //   874: astore_0
/*     */     //   875: aload #19
/*     */     //   877: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   880: aload #19
/*     */     //   882: pop
/*     */     //   883: goto -> 318
/*     */     //   886: aload_0
/*     */     //   887: aload #6
/*     */     //   889: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult$Success
/*     */     //   892: invokevirtual getEdits : ()Ljava/util/List;
/*     */     //   895: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType.UPDATE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;
/*     */     //   898: aload #7
/*     */     //   900: aload_2
/*     */     //   901: iload_3
/*     */     //   902: ifeq -> 909
/*     */     //   905: iconst_1
/*     */     //   906: goto -> 910
/*     */     //   909: iconst_0
/*     */     //   910: aload #4
/*     */     //   912: aload #20
/*     */     //   914: aload #20
/*     */     //   916: aconst_null
/*     */     //   917: putfield L$0 : Ljava/lang/Object;
/*     */     //   920: aload #20
/*     */     //   922: aconst_null
/*     */     //   923: putfield L$1 : Ljava/lang/Object;
/*     */     //   926: aload #20
/*     */     //   928: aconst_null
/*     */     //   929: putfield L$2 : Ljava/lang/Object;
/*     */     //   932: aload #20
/*     */     //   934: aconst_null
/*     */     //   935: putfield L$3 : Ljava/lang/Object;
/*     */     //   938: aload #20
/*     */     //   940: aconst_null
/*     */     //   941: putfield L$4 : Ljava/lang/Object;
/*     */     //   944: aload #20
/*     */     //   946: aconst_null
/*     */     //   947: putfield L$5 : Ljava/lang/Object;
/*     */     //   950: aload #20
/*     */     //   952: iconst_4
/*     */     //   953: putfield label : I
/*     */     //   956: invokevirtual doSearchReplace : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;Ljava/util/Map;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   959: dup
/*     */     //   960: aload #21
/*     */     //   962: if_acmpne -> 975
/*     */     //   965: aload #21
/*     */     //   967: areturn
/*     */     //   968: aload #19
/*     */     //   970: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   973: aload #19
/*     */     //   975: areturn
/*     */     //   976: new java/lang/IllegalStateException
/*     */     //   979: dup
/*     */     //   980: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   982: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   985: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #123	-> 63
/*     */     //   #129	-> 109
/*     */     //   #131	-> 118
/*     */     //   #132	-> 119
/*     */     //   #133	-> 120
/*     */     //   #134	-> 134
/*     */     //   #136	-> 136
/*     */     //   #138	-> 141
/*     */     //   #140	-> 148
/*     */     //   #135	-> 154
/*     */     //   #142	-> 155
/*     */     //   #143	-> 163
/*     */     //   #145	-> 172
/*     */     //   #146	-> 186
/*     */     //   #146	-> 196
/*     */     //   #147	-> 198
/*     */     //   #800	-> 214
/*     */     //   #801	-> 240
/*     */     //   #802	-> 268
/*     */     //   #147	-> 282
/*     */     //   #802	-> 290
/*     */     //   #803	-> 299
/*     */     //   #800	-> 304
/*     */     //   #147	-> 308
/*     */     //   #148	-> 340
/*     */     //   #123	-> 416
/*     */     //   #149	-> 505
/*     */     //   #150	-> 513
/*     */     //   #152	-> 527
/*     */     //   #153	-> 541
/*     */     //   #123	-> 618
/*     */     //   #153	-> 702
/*     */     //   #155	-> 710
/*     */     //   #153	-> 718
/*     */     //   #157	-> 720
/*     */     //   #158	-> 732
/*     */     //   #123	-> 808
/*     */     //   #158	-> 882
/*     */     //   #162	-> 886
/*     */     //   #123	-> 965
/*     */     //   #162	-> 975
/*     */     //   #123	-> 976
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;
/*     */     //   155	8	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;
/*     */     //   172	24	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;
/*     */     //   196	91	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;
/*     */     //   287	18	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;
/*     */     //   305	114	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;
/*     */     //   493	128	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;
/*     */     //   695	116	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;
/*     */     //   875	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;
/*     */     //   109	22	1	overrideParsedFileBy	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   109	25	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   155	8	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   172	24	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   196	91	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   287	18	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   305	114	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   484	137	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   686	125	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   866	43	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   109	25	3	dryRun	Z
/*     */     //   155	8	3	dryRun	Z
/*     */     //   172	24	3	dryRun	Z
/*     */     //   196	91	3	dryRun	Z
/*     */     //   287	18	3	dryRun	Z
/*     */     //   305	114	3	dryRun	Z
/*     */     //   425	196	3	dryRun	Z
/*     */     //   627	184	3	dryRun	Z
/*     */     //   817	92	3	dryRun	Z
/*     */     //   109	39	4	arguments	Ljava/lang/String;
/*     */     //   155	8	4	arguments	Ljava/lang/String;
/*     */     //   172	24	4	arguments	Ljava/lang/String;
/*     */     //   196	91	4	arguments	Ljava/lang/String;
/*     */     //   287	18	4	arguments	Ljava/lang/String;
/*     */     //   305	114	4	arguments	Ljava/lang/String;
/*     */     //   475	146	4	arguments	Ljava/lang/String;
/*     */     //   677	134	4	arguments	Ljava/lang/String;
/*     */     //   857	102	4	arguments	Ljava/lang/String;
/*     */     //   131	3	6	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;
/*     */     //   155	17	6	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;
/*     */     //   172	24	6	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;
/*     */     //   196	91	6	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;
/*     */     //   287	18	6	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;
/*     */     //   305	114	6	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;
/*     */     //   465	156	6	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;
/*     */     //   667	144	6	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;
/*     */     //   847	62	6	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;
/*     */     //   136	19	7	e	Ljava/lang/Exception;
/*     */     //   198	89	7	fileNameToDocument	Ljava/util/Map;
/*     */     //   287	18	7	fileNameToDocument	Ljava/util/Map;
/*     */     //   305	114	7	fileNameToDocument	Ljava/util/Map;
/*     */     //   455	166	7	fileNameToDocument	Ljava/util/Map;
/*     */     //   657	154	7	fileNameToDocument	Ljava/util/Map;
/*     */     //   837	72	7	fileNameToDocument	Ljava/util/Map;
/*     */     //   211	26	9	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   340	79	9	file	Ljava/lang/String;
/*     */     //   435	186	9	file	Ljava/lang/String;
/*     */     //   637	81	9	file	Ljava/lang/String;
/*     */     //   718	14	9	file	Ljava/lang/String;
/*     */     //   505	22	10	openRes	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   527	85	10	openRes	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   237	12	11	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   720	12	11	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   732	70	11	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   237	64	12	destination$iv$iv	Ljava/util/Collection;
/*     */     //   268	28	15	item$iv$iv	Ljava/lang/Object;
/*     */     //   279	8	16	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/Edit;
/*     */     //   282	5	17	$i$a$-map-EditSearchReplace$doSearchReplace$2	I
/*     */     //   240	61	13	$i$f$mapTo	I
/*     */     //   214	91	10	$i$f$map	I
/*     */     //   0	986	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	923	20	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	916	19	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   119	131	134	java/lang/Exception
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Document doSearchReplace$lambda$2(Result $openRes) {
/* 154 */     return FileDocumentManager.getInstance().getDocument((VirtualFile)((Result.Ok)$openRes).getValue());
/*     */   }
/*     */ 
/*     */   
/*     */   private static final VirtualFile doSearchReplace$lambda$3(Document $document) {
/* 159 */     return FileDocumentManager.getInstance().getFile($document);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final PsiFile doSearchReplace$lambda$4(PsiDocumentManager $documentManager, Map $fileNameToDocument, Edit $edit, HashMap<String, Path> $fileNameToPath) {
/*     */     PsiFile originalPsiFile;
/* 183 */     Intrinsics.checkNotNull($fileNameToDocument.get($edit.getFileName())); if ($documentManager.getPsiFile((Document)$fileNameToDocument.get($edit.getFileName())) == null) { $documentManager.getPsiFile((Document)$fileNameToDocument.get($edit.getFileName())); throw new IllegalStateException(("Failed to get PSI file for " + 
/* 184 */           $edit.getFileName()).toString()); }
/* 185 */      Intrinsics.checkNotNullExpressionValue(originalPsiFile.getVirtualFile().toNioPath(), "toNioPath(...)"); Path nioPath = originalPsiFile.getVirtualFile().toNioPath();
/* 186 */     $fileNameToPath.put($edit.getFileName(), nioPath);
/* 187 */     Intrinsics.checkNotNull(originalPsiFile.copy(), "null cannot be cast to non-null type com.intellij.psi.PsiFile"); return (PsiFile)originalPsiFile.copy();
/*     */   }
/*     */   private static final Document doSearchReplace$lambda$5(PsiFile $copy, PsiDocumentManager $documentManager) {
/* 190 */     Document copyDocument = $copy.getViewProvider().getDocument();
/* 191 */     $documentManager.commitDocument(copyDocument);
/* 192 */     return copyDocument;
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
/*     */   private static final Unit doSearchReplace$lambda$6(HashMap $updatedDocumentCopies, Edit $edit, MatchingResult $editRes, PsiDocumentManager $documentManager) {
/* 205 */     Intrinsics.checkNotNull($updatedDocumentCopies.get($edit.getFileName())); ((Document)$updatedDocumentCopies.get($edit.getFileName())).setText(((MatchingResult.Success)$editRes).getUpdatedText());
/* 206 */     Intrinsics.checkNotNull($updatedDocumentCopies.get($edit.getFileName())); $documentManager.commitDocument((Document)$updatedDocumentCopies.get($edit.getFileName()));
/* 207 */     return Unit.INSTANCE;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object getResultMessage(Map $this$getResultMessage, Project project, Map fileNameToDocument, EditType editType, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$getResultMessage$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$getResultMessage$1
/*     */     //   13: astore #20
/*     */     //   15: aload #20
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #20
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$getResultMessage$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #20
/*     */     //   53: aload #20
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #19
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #21
/*     */     //   65: aload #20
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 566, 0 -> 92, 1 -> 396
/*     */     //   92: aload #19
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_1
/*     */     //   98: astore #7
/*     */     //   100: iconst_0
/*     */     //   101: istore #8
/*     */     //   103: new java/util/LinkedHashMap
/*     */     //   106: dup
/*     */     //   107: invokespecial <init> : ()V
/*     */     //   110: astore #9
/*     */     //   112: aload #7
/*     */     //   114: invokeinterface entrySet : ()Ljava/util/Set;
/*     */     //   119: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   124: astore #10
/*     */     //   126: aload #10
/*     */     //   128: invokeinterface hasNext : ()Z
/*     */     //   133: ifeq -> 208
/*     */     //   136: aload #10
/*     */     //   138: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   143: checkcast java/util/Map$Entry
/*     */     //   146: astore #11
/*     */     //   148: aload #11
/*     */     //   150: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   155: checkcast java/util/List
/*     */     //   158: astore #12
/*     */     //   160: iconst_0
/*     */     //   161: istore #13
/*     */     //   163: aload #12
/*     */     //   165: checkcast java/util/Collection
/*     */     //   168: invokeinterface isEmpty : ()Z
/*     */     //   173: ifne -> 180
/*     */     //   176: iconst_1
/*     */     //   177: goto -> 181
/*     */     //   180: iconst_0
/*     */     //   181: nop
/*     */     //   182: ifeq -> 126
/*     */     //   185: aload #9
/*     */     //   187: aload #11
/*     */     //   189: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   194: aload #11
/*     */     //   196: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   201: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   204: pop
/*     */     //   205: goto -> 126
/*     */     //   208: aload #9
/*     */     //   210: checkcast java/util/Map
/*     */     //   213: astore #7
/*     */     //   215: iconst_0
/*     */     //   216: istore #8
/*     */     //   218: aload #7
/*     */     //   220: astore #9
/*     */     //   222: new java/util/ArrayList
/*     */     //   225: dup
/*     */     //   226: aload #7
/*     */     //   228: invokeinterface size : ()I
/*     */     //   233: invokespecial <init> : (I)V
/*     */     //   236: checkcast java/util/Collection
/*     */     //   239: astore #10
/*     */     //   241: iconst_0
/*     */     //   242: istore #11
/*     */     //   244: aload #9
/*     */     //   246: invokeinterface entrySet : ()Ljava/util/Set;
/*     */     //   251: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   256: astore #12
/*     */     //   258: aload #12
/*     */     //   260: invokeinterface hasNext : ()Z
/*     */     //   265: ifeq -> 485
/*     */     //   268: aload #12
/*     */     //   270: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   275: checkcast java/util/Map$Entry
/*     */     //   278: astore #13
/*     */     //   280: aload #10
/*     */     //   282: aload #13
/*     */     //   284: astore #14
/*     */     //   286: astore #18
/*     */     //   288: iconst_0
/*     */     //   289: istore #15
/*     */     //   291: aload #14
/*     */     //   293: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   298: checkcast java/lang/String
/*     */     //   301: astore #16
/*     */     //   303: aload #14
/*     */     //   305: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   310: checkcast java/util/List
/*     */     //   313: astore #17
/*     */     //   315: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;
/*     */     //   318: aload #17
/*     */     //   320: aload_2
/*     */     //   321: aload_3
/*     */     //   322: aload #16
/*     */     //   324: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   329: dup
/*     */     //   330: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   333: checkcast com/intellij/openapi/editor/Document
/*     */     //   336: aload #20
/*     */     //   338: aload #20
/*     */     //   340: aload_2
/*     */     //   341: putfield L$0 : Ljava/lang/Object;
/*     */     //   344: aload #20
/*     */     //   346: aload_3
/*     */     //   347: putfield L$1 : Ljava/lang/Object;
/*     */     //   350: aload #20
/*     */     //   352: aload #4
/*     */     //   354: putfield L$2 : Ljava/lang/Object;
/*     */     //   357: aload #20
/*     */     //   359: aload #10
/*     */     //   361: putfield L$3 : Ljava/lang/Object;
/*     */     //   364: aload #20
/*     */     //   366: aload #12
/*     */     //   368: putfield L$4 : Ljava/lang/Object;
/*     */     //   371: aload #20
/*     */     //   373: aload #18
/*     */     //   375: putfield L$5 : Ljava/lang/Object;
/*     */     //   378: aload #20
/*     */     //   380: iconst_1
/*     */     //   381: putfield label : I
/*     */     //   384: invokevirtual toErrorMessages$ej_core : (Ljava/util/List;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   387: dup
/*     */     //   388: aload #21
/*     */     //   390: if_acmpne -> 470
/*     */     //   393: aload #21
/*     */     //   395: areturn
/*     */     //   396: iconst_0
/*     */     //   397: istore #8
/*     */     //   399: iconst_0
/*     */     //   400: istore #11
/*     */     //   402: iconst_0
/*     */     //   403: istore #15
/*     */     //   405: aload #20
/*     */     //   407: getfield L$5 : Ljava/lang/Object;
/*     */     //   410: checkcast java/util/Collection
/*     */     //   413: astore #18
/*     */     //   415: aload #20
/*     */     //   417: getfield L$4 : Ljava/lang/Object;
/*     */     //   420: checkcast java/util/Iterator
/*     */     //   423: astore #12
/*     */     //   425: aload #20
/*     */     //   427: getfield L$3 : Ljava/lang/Object;
/*     */     //   430: checkcast java/util/Collection
/*     */     //   433: astore #10
/*     */     //   435: aload #20
/*     */     //   437: getfield L$2 : Ljava/lang/Object;
/*     */     //   440: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType
/*     */     //   443: astore #4
/*     */     //   445: aload #20
/*     */     //   447: getfield L$1 : Ljava/lang/Object;
/*     */     //   450: checkcast java/util/Map
/*     */     //   453: astore_3
/*     */     //   454: aload #20
/*     */     //   456: getfield L$0 : Ljava/lang/Object;
/*     */     //   459: checkcast com/intellij/openapi/project/Project
/*     */     //   462: astore_2
/*     */     //   463: aload #19
/*     */     //   465: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   468: aload #19
/*     */     //   470: checkcast java/util/List
/*     */     //   473: aload #18
/*     */     //   475: swap
/*     */     //   476: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   481: pop
/*     */     //   482: goto -> 258
/*     */     //   485: aload #10
/*     */     //   487: checkcast java/util/List
/*     */     //   490: nop
/*     */     //   491: checkcast java/lang/Iterable
/*     */     //   494: invokestatic flatten : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   497: astore #6
/*     */     //   499: nop
/*     */     //   500: aload #6
/*     */     //   502: invokeinterface isEmpty : ()Z
/*     */     //   507: ifeq -> 526
/*     */     //   510: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$Companion;
/*     */     //   513: aload #4
/*     */     //   515: invokevirtual getSuccessEditMessage : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;)Ljava/lang/String;
/*     */     //   518: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   523: goto -> 561
/*     */     //   526: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$Companion;
/*     */     //   529: aload #4
/*     */     //   531: invokevirtual getEditWithIssuesMessage : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;)Ljava/lang/String;
/*     */     //   534: aload #6
/*     */     //   536: checkcast java/lang/Iterable
/*     */     //   539: ldc_w '\\n'
/*     */     //   542: checkcast java/lang/CharSequence
/*     */     //   545: aconst_null
/*     */     //   546: aconst_null
/*     */     //   547: iconst_0
/*     */     //   548: aconst_null
/*     */     //   549: aconst_null
/*     */     //   550: bipush #62
/*     */     //   552: aconst_null
/*     */     //   553: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   556: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   561: astore #7
/*     */     //   563: aload #7
/*     */     //   565: areturn
/*     */     //   566: new java/lang/IllegalStateException
/*     */     //   569: dup
/*     */     //   570: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   572: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   575: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #336	-> 63
/*     */     //   #341	-> 97
/*     */     //   #828	-> 103
/*     */     //   #829	-> 112
/*     */     //   #829	-> 124
/*     */     //   #830	-> 148
/*     */     //   #341	-> 163
/*     */     //   #341	-> 181
/*     */     //   #830	-> 182
/*     */     //   #831	-> 185
/*     */     //   #834	-> 208
/*     */     //   #341	-> 215
/*     */     //   #835	-> 218
/*     */     //   #836	-> 244
/*     */     //   #836	-> 256
/*     */     //   #837	-> 280
/*     */     //   #341	-> 291
/*     */     //   #341	-> 298
/*     */     //   #341	-> 310
/*     */     //   #342	-> 315
/*     */     //   #336	-> 393
/*     */     //   #342	-> 470
/*     */     //   #837	-> 476
/*     */     //   #838	-> 485
/*     */     //   #835	-> 490
/*     */     //   #343	-> 494
/*     */     //   #341	-> 497
/*     */     //   #344	-> 499
/*     */     //   #345	-> 500
/*     */     //   #347	-> 510
/*     */     //   #352	-> 526
/*     */     //   #353	-> 534
/*     */     //   #344	-> 561
/*     */     //   #356	-> 563
/*     */     //   #336	-> 566
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	3	1	$this$getResultMessage	Ljava/util/Map;
/*     */     //   97	85	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   182	31	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   213	183	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   463	10	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   473	12	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   97	85	3	fileNameToDocument	Ljava/util/Map;
/*     */     //   182	31	3	fileNameToDocument	Ljava/util/Map;
/*     */     //   213	183	3	fileNameToDocument	Ljava/util/Map;
/*     */     //   454	19	3	fileNameToDocument	Ljava/util/Map;
/*     */     //   473	12	3	fileNameToDocument	Ljava/util/Map;
/*     */     //   97	85	4	editType	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;
/*     */     //   182	31	4	editType	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;
/*     */     //   213	183	4	editType	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;
/*     */     //   445	28	4	editType	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;
/*     */     //   473	18	4	editType	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;
/*     */     //   491	35	4	editType	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;
/*     */     //   526	8	4	editType	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;
/*     */     //   499	11	6	errorsMessages	Ljava/util/List;
/*     */     //   526	35	6	errorsMessages	Ljava/util/List;
/*     */     //   100	24	7	$this$filterValues$iv	Ljava/util/Map;
/*     */     //   215	26	7	$this$map$iv	Ljava/util/Map;
/*     */     //   563	3	7	res	Ljava/lang/String;
/*     */     //   112	101	9	result$iv	Ljava/util/LinkedHashMap;
/*     */     //   241	15	9	$this$mapTo$iv$iv	Ljava/util/Map;
/*     */     //   241	155	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   435	52	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   148	57	11	entry$iv	Ljava/util/Map$Entry;
/*     */     //   160	20	12	it	Ljava/util/List;
/*     */     //   280	8	13	item$iv$iv	Ljava/util/Map$Entry;
/*     */     //   303	84	16	fileName	Ljava/lang/String;
/*     */     //   315	72	17	errors	Ljava/util/List;
/*     */     //   163	19	13	$i$a$-filterValues-EditSearchReplace$getResultMessage$errorsMessages$1	I
/*     */     //   103	110	8	$i$f$filterValues	I
/*     */     //   291	105	15	$i$a$-map-EditSearchReplace$getResultMessage$errorsMessages$2	I
/*     */     //   244	152	11	$i$f$mapTo	I
/*     */     //   218	178	8	$i$f$map	I
/*     */     //   0	576	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	513	20	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	506	19	$result	Ljava/lang/Object;
/*     */     //   405	68	15	$i$a$-map-EditSearchReplace$getResultMessage$errorsMessages$2	I
/*     */     //   402	85	11	$i$f$mapTo	I
/*     */     //   399	92	8	$i$f$map	I
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object findSemanticErrors(ExecutionAgentContext executionContext, Project project, Map updatedDocumentCopies, Map fileNameToDocument, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$findSemanticErrors$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$findSemanticErrors$1
/*     */     //   13: astore #24
/*     */     //   15: aload #24
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #24
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$findSemanticErrors$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #24
/*     */     //   53: aload #24
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #23
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #25
/*     */     //   65: aload #24
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 421, 0 -> 92, 1 -> 285
/*     */     //   92: aload #23
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_3
/*     */     //   98: invokeinterface keySet : ()Ljava/util/Set;
/*     */     //   103: checkcast java/lang/Iterable
/*     */     //   106: astore #6
/*     */     //   108: iconst_0
/*     */     //   109: istore #7
/*     */     //   111: aload #6
/*     */     //   113: astore #8
/*     */     //   115: new java/util/ArrayList
/*     */     //   118: dup
/*     */     //   119: invokespecial <init> : ()V
/*     */     //   122: checkcast java/util/Collection
/*     */     //   125: astore #9
/*     */     //   127: iconst_0
/*     */     //   128: istore #10
/*     */     //   130: aload #8
/*     */     //   132: astore #11
/*     */     //   134: iconst_0
/*     */     //   135: istore #12
/*     */     //   137: aload #11
/*     */     //   139: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   144: astore #13
/*     */     //   146: aload #13
/*     */     //   148: invokeinterface hasNext : ()Z
/*     */     //   153: ifeq -> 407
/*     */     //   156: aload #13
/*     */     //   158: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   163: astore #14
/*     */     //   165: aload #14
/*     */     //   167: astore #15
/*     */     //   169: iconst_0
/*     */     //   170: istore #16
/*     */     //   172: aload #15
/*     */     //   174: checkcast java/lang/String
/*     */     //   177: astore #17
/*     */     //   179: iconst_0
/*     */     //   180: istore #18
/*     */     //   182: aload #4
/*     */     //   184: aload #17
/*     */     //   186: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   191: dup
/*     */     //   192: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   195: checkcast com/intellij/openapi/editor/Document
/*     */     //   198: astore #19
/*     */     //   200: aload #17
/*     */     //   202: astore #20
/*     */     //   204: aload_0
/*     */     //   205: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction
/*     */     //   208: aload_1
/*     */     //   209: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType.SEMANTIC : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;
/*     */     //   212: aload_2
/*     */     //   213: aload #19
/*     */     //   215: aconst_null
/*     */     //   216: aload #24
/*     */     //   218: bipush #16
/*     */     //   220: aconst_null
/*     */     //   221: aload #24
/*     */     //   223: aload_0
/*     */     //   224: putfield L$0 : Ljava/lang/Object;
/*     */     //   227: aload #24
/*     */     //   229: aload_1
/*     */     //   230: putfield L$1 : Ljava/lang/Object;
/*     */     //   233: aload #24
/*     */     //   235: aload_2
/*     */     //   236: putfield L$2 : Ljava/lang/Object;
/*     */     //   239: aload #24
/*     */     //   241: aload #4
/*     */     //   243: putfield L$3 : Ljava/lang/Object;
/*     */     //   246: aload #24
/*     */     //   248: aload #9
/*     */     //   250: putfield L$4 : Ljava/lang/Object;
/*     */     //   253: aload #24
/*     */     //   255: aload #13
/*     */     //   257: putfield L$5 : Ljava/lang/Object;
/*     */     //   260: aload #24
/*     */     //   262: aload #20
/*     */     //   264: putfield L$6 : Ljava/lang/Object;
/*     */     //   267: aload #24
/*     */     //   269: iconst_1
/*     */     //   270: putfield label : I
/*     */     //   273: invokestatic findErrorsWithTracking$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   276: dup
/*     */     //   277: aload #25
/*     */     //   279: if_acmpne -> 374
/*     */     //   282: aload #25
/*     */     //   284: areturn
/*     */     //   285: iconst_0
/*     */     //   286: istore #7
/*     */     //   288: iconst_0
/*     */     //   289: istore #10
/*     */     //   291: iconst_0
/*     */     //   292: istore #12
/*     */     //   294: iconst_0
/*     */     //   295: istore #16
/*     */     //   297: iconst_0
/*     */     //   298: istore #18
/*     */     //   300: aload #24
/*     */     //   302: getfield L$6 : Ljava/lang/Object;
/*     */     //   305: checkcast java/lang/String
/*     */     //   308: astore #20
/*     */     //   310: aload #24
/*     */     //   312: getfield L$5 : Ljava/lang/Object;
/*     */     //   315: checkcast java/util/Iterator
/*     */     //   318: astore #13
/*     */     //   320: aload #24
/*     */     //   322: getfield L$4 : Ljava/lang/Object;
/*     */     //   325: checkcast java/util/Collection
/*     */     //   328: astore #9
/*     */     //   330: aload #24
/*     */     //   332: getfield L$3 : Ljava/lang/Object;
/*     */     //   335: checkcast java/util/Map
/*     */     //   338: astore #4
/*     */     //   340: aload #24
/*     */     //   342: getfield L$2 : Ljava/lang/Object;
/*     */     //   345: checkcast com/intellij/openapi/project/Project
/*     */     //   348: astore_2
/*     */     //   349: aload #24
/*     */     //   351: getfield L$1 : Ljava/lang/Object;
/*     */     //   354: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   357: astore_1
/*     */     //   358: aload #24
/*     */     //   360: getfield L$0 : Ljava/lang/Object;
/*     */     //   363: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace
/*     */     //   366: astore_0
/*     */     //   367: aload #23
/*     */     //   369: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   372: aload #23
/*     */     //   374: aload #20
/*     */     //   376: swap
/*     */     //   377: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   380: nop
/*     */     //   381: dup
/*     */     //   382: ifnull -> 403
/*     */     //   385: astore #21
/*     */     //   387: iconst_0
/*     */     //   388: istore #22
/*     */     //   390: aload #9
/*     */     //   392: aload #21
/*     */     //   394: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   399: pop
/*     */     //   400: goto -> 404
/*     */     //   403: pop
/*     */     //   404: goto -> 146
/*     */     //   407: nop
/*     */     //   408: aload #9
/*     */     //   410: checkcast java/util/List
/*     */     //   413: nop
/*     */     //   414: checkcast java/lang/Iterable
/*     */     //   417: invokestatic toMap : (Ljava/lang/Iterable;)Ljava/util/Map;
/*     */     //   420: areturn
/*     */     //   421: new java/lang/IllegalStateException
/*     */     //   424: dup
/*     */     //   425: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   427: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   430: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #359	-> 63
/*     */     //   #364	-> 97
/*     */     //   #839	-> 111
/*     */     //   #847	-> 130
/*     */     //   #848	-> 137
/*     */     //   #847	-> 172
/*     */     //   #365	-> 182
/*     */     //   #366	-> 200
/*     */     //   #367	-> 208
/*     */     //   #368	-> 209
/*     */     //   #369	-> 212
/*     */     //   #370	-> 213
/*     */     //   #366	-> 215
/*     */     //   #359	-> 282
/*     */     //   #366	-> 374
/*     */     //   #371	-> 380
/*     */     //   #847	-> 381
/*     */     //   #849	-> 387
/*     */     //   #847	-> 390
/*     */     //   #847	-> 400
/*     */     //   #847	-> 403
/*     */     //   #848	-> 404
/*     */     //   #850	-> 407
/*     */     //   #851	-> 408
/*     */     //   #839	-> 413
/*     */     //   #372	-> 417
/*     */     //   #359	-> 421
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	188	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;
/*     */     //   367	14	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;
/*     */     //   381	40	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace;
/*     */     //   97	188	1	executionContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   358	23	1	executionContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   381	40	1	executionContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   97	188	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   349	32	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   381	40	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   97	11	3	updatedDocumentCopies	Ljava/util/Map;
/*     */     //   97	188	4	fileNameToDocument	Ljava/util/Map;
/*     */     //   340	41	4	fileNameToDocument	Ljava/util/Map;
/*     */     //   381	40	4	fileNameToDocument	Ljava/util/Map;
/*     */     //   108	19	6	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*     */     //   127	7	8	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   127	158	9	destination$iv$iv	Ljava/util/Collection;
/*     */     //   330	51	9	destination$iv$iv	Ljava/util/Collection;
/*     */     //   381	29	9	destination$iv$iv	Ljava/util/Collection;
/*     */     //   134	12	11	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   165	4	14	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   169	10	15	element$iv$iv	Ljava/lang/Object;
/*     */     //   179	29	17	fileName	Ljava/lang/String;
/*     */     //   200	15	19	originalDocUpdated	Lcom/intellij/openapi/editor/Document;
/*     */     //   387	13	21	it$iv$iv	Ljava/lang/Object;
/*     */     //   182	103	18	$i$a$-mapNotNull-EditSearchReplace$findSemanticErrors$2	I
/*     */     //   390	10	22	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   172	113	16	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   137	148	12	$i$f$forEach	I
/*     */     //   130	155	10	$i$f$mapNotNullTo	I
/*     */     //   111	174	7	$i$f$mapNotNull	I
/*     */     //   0	431	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	368	24	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	361	23	$result	Ljava/lang/Object;
/*     */     //   300	81	18	$i$a$-mapNotNull-EditSearchReplace$findSemanticErrors$2	I
/*     */     //   297	107	16	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   294	114	12	$i$f$forEach	I
/*     */     //   291	119	10	$i$f$mapNotNullTo	I
/*     */     //   288	126	7	$i$f$mapNotNull	I
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\007\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\032\020\f\032\0020\r2\006\020\016\032\0020\0052\b\020\017\032\004\030\0010\020H\002J\n\020\021\032\0020\005*\0020\022J\n\020\023\032\0020\005*\0020\022J\032\020\024\032\0020\005*\0020\0222\006\020\025\032\0020\0052\006\020\026\032\0020\005R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\005XT¢\006\002\n\000R\016\020\t\032\0020\005XT¢\006\002\n\000R\016\020\n\032\0020\005XT¢\006\002\n\000R\016\020\013\032\0020\005XT¢\006\002\n\000¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$Companion;", "", "<init>", "()V", "SEARCH_REPLACE_ACTION_NAME", "", "REVIEW_MESSAGE", "FILE_UPDATED_MESSAGE", "FILE_CREATED_MESSAGE", "BAD_QOUTES_MESSAGE", "SEARCH_REPLACE_COMMON_DOCSTRING_PART", "EDIT_ARGUMENT", "parseSearchReplace", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;", "arguments", "overrideParsedFileBy", "Lcom/intellij/openapi/vfs/VirtualFile;", "getSuccessEditMessage", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;", "getEditWithIssuesMessage", "getMessage", "codeBefore", "codeAfter", "ej-core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final SearchReplaceParseResult parseSearchReplace(String arguments, VirtualFile overrideParsedFileBy) {
/* 396 */       AgentUtilsKt.toNioPathOrNull(overrideParsedFileBy); List<Edit> edits = EditSearchReplaceKt.findOriginalUpdateBlocksXML(arguments, (overrideParsedFileBy != null && AgentUtilsKt.toNioPathOrNull(overrideParsedFileBy) != null) ? AgentUtilsKt.toNioPathOrNull(overrideParsedFileBy).toString() : null);
/* 397 */       if (!edits.isEmpty()) {
/* 398 */         return new SearchReplaceParseResult.Success(edits);
/*     */       }
/* 400 */       return new SearchReplaceParseResult.Error(
/*     */ 
/*     */ 
/*     */           
/* 404 */           StringsKt.trimMargin$default("ERROR: failed to find *SEARCH/REPLACE* blocks in your input:\n                    |```\n                    |" + arguments + "\n                    |```", null, 1, null));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getSuccessEditMessage(@NotNull EditType $this$getSuccessEditMessage) {
/* 409 */       Intrinsics.checkNotNullParameter($this$getSuccessEditMessage, "<this>"); switch (WhenMappings.$EnumSwitchMapping$0[$this$getSuccessEditMessage.ordinal()]) { case 1: case 2:  }  throw new NoWhenBranchMatchedException();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final String getEditWithIssuesMessage(@NotNull EditType $this$getEditWithIssuesMessage) {
/* 416 */       Intrinsics.checkNotNullParameter($this$getEditWithIssuesMessage, "<this>"); String revertMessage = "Please revert changes using `undo_edit` or edit the file again to correct following issues:\n";
/* 417 */       switch (WhenMappings.$EnumSwitchMapping$0[$this$getEditWithIssuesMessage.ordinal()]) { case 1: case 2:  }  throw new NoWhenBranchMatchedException();
/*     */     }
/*     */     @NotNull
/*     */     public final String getMessage(@NotNull EditType $this$getMessage, @NotNull String codeBefore, @NotNull String codeAfter) {
/*     */       StringBuilder stringBuilder1, $this$getMessage_u24lambda_u240, $this$getMessage_u24lambda_u241;
/*     */       int $i$a$-buildString-EditSearchReplace$Companion$getMessage$1, $i$a$-buildString-EditSearchReplace$Companion$getMessage$2;
/* 423 */       Intrinsics.checkNotNullParameter($this$getMessage, "<this>"); Intrinsics.checkNotNullParameter(codeBefore, "codeBefore"); Intrinsics.checkNotNullParameter(codeAfter, "codeAfter"); switch (WhenMappings.$EnumSwitchMapping$0[$this$getMessage.ordinal()]) { case 1:
/* 424 */           $this$getMessage_u24lambda_u240 = stringBuilder1 = new StringBuilder(); $i$a$-buildString-EditSearchReplace$Companion$getMessage$1 = 0;
/* 425 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("NONE OF YOUR EDITS HAVE BEEN APPLIED. FIX PROBLEMS IN `search_replace` PARAMETERS AND TRY AGAIN."), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("NONE OF YOUR EDITS HAVE BEEN APPLIED. FIX PROBLEMS IN `search_replace` PARAMETERS AND TRY AGAIN.").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("NONE OF YOUR EDITS HAVE BEEN APPLIED. FIX PROBLEMS IN `search_replace` PARAMETERS AND TRY AGAIN.").append('\n');
/* 426 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append('\n');
/* 427 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("This is how your edit would have looked if applied:"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("This is how your edit would have looked if applied:").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("This is how your edit would have looked if applied:").append('\n');
/* 428 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n');
/* 429 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append(codeAfter), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append(codeAfter).append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append(codeAfter).append('\n');
/* 430 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n');
/* 431 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("This is the original code before your edit:"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("This is the original code before your edit:").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("This is the original code before your edit:").append('\n');
/* 432 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n');
/* 433 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append(codeBefore), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append(codeBefore).append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append(codeBefore).append('\n');
/* 434 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n');
/* 435 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("Your changes have NOT been applied. Please fix your edit command and try again."), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("Your changes have NOT been applied. Please fix your edit command and try again.").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("Your changes have NOT been applied. Please fix your edit command and try again.").append('\n');
/*     */           Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */         case 2:
/* 438 */           $this$getMessage_u24lambda_u241 = stringBuilder1 = new StringBuilder(); $i$a$-buildString-EditSearchReplace$Companion$getMessage$2 = 0;
/* 439 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("NONE OF YOUR EDITS HAVE BEEN APPLIED. FIX PROBLEMS IN CONTENT BLOCKS AND TRY AGAIN."), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("NONE OF YOUR EDITS HAVE BEEN APPLIED. FIX PROBLEMS IN CONTENT BLOCKS AND TRY AGAIN.").append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append("NONE OF YOUR EDITS HAVE BEEN APPLIED. FIX PROBLEMS IN CONTENT BLOCKS AND TRY AGAIN.").append('\n');
/* 440 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append('\n');
/* 441 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("This is how your edit would have looked if applied:"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("This is how your edit would have looked if applied:").append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append("This is how your edit would have looked if applied:").append('\n');
/* 442 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("-------------------------------------------------"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("-------------------------------------------------").append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append("-------------------------------------------------").append('\n');
/* 443 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append(codeAfter), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append(codeAfter).append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append(codeAfter).append('\n');
/* 444 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("-------------------------------------------------"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("-------------------------------------------------").append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append("-------------------------------------------------").append('\n');
/* 445 */           Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("Your changes have NOT been applied. Please fix your create command and try again."), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("Your changes have NOT been applied. Please fix your create command and try again.").append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append("Your changes have NOT been applied. Please fix your create command and try again.").append('\n');
/*     */           Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)"); }
/*     */       
/*     */       throw new NoWhenBranchMatchedException();
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation<? super String> $completion) {
/*     */     return execute$suspendImpl(this, request, context, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation<? super String> $completion) {
/*     */     return reviewActionRequest$suspendImpl(this, request, context, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object doSearchReplace(@NotNull List<Edit> edits, @NotNull EditType editType, @NotNull Map<String, ? extends Document> fileNameToDocument, @NotNull ExecutionAgentContext context, boolean dryRun, @NotNull String arguments, @NotNull Continuation<? super String> $completion) {
/*     */     return doSearchReplace$suspendImpl(this, edits, editType, fileNameToDocument, context, dryRun, arguments, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected Object resultFromErrorMessages(@NotNull List<? extends Error> errors, @NotNull Project project, @NotNull Document document, boolean isEmptyDiff, boolean hasMultipleEdits, @NotNull Continuation<? super String> $completion) {
/*     */     return resultFromErrorMessages$suspendImpl(this, errors, project, document, isEmptyDiff, hasMultipleEdits, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected Object formatErrorMessage(@NotNull Edit edit, @NotNull MatchingResult matchingResult, @NotNull Map<String, ? extends Document> fileNameToDocument, @NotNull AgentSessionHistory agentSessionHistory, @NotNull Continuation<? super String> $completion) {
/*     */     return formatErrorMessage$suspendImpl(this, edit, matchingResult, fileNameToDocument, agentSessionHistory, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditSearchReplace.kt", l = {182, 189, 204, 216, 240, 249, 257, 265, 275, 282, 288, 298, 303, 307, 317}, i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$12", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$12", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "L$11", "L$12", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, n = {"$this", "edits", "editType", "fileNameToDocument", "context", "arguments", "project", "documentManager", "updatedDocumentCopies", "erroredBlocks", "fileNameToPath", "edit", "dryRun", "$this", "edits", "editType", "fileNameToDocument", "context", "arguments", "project", "documentManager", "updatedDocumentCopies", "erroredBlocks", "fileNameToPath", "edit", "dryRun", "$this", "edits", "editType", "fileNameToDocument", "context", "arguments", "project", "documentManager", "updatedDocumentCopies", "erroredBlocks", "fileNameToPath", "dryRun", "$this", "edits", "context", "arguments", "updatedDocumentCopies", "destination$iv$iv", "$this", "edits", "editType", "fileNameToDocument", "context", "project", "updatedDocumentCopies", "fileNameToPath", "codeChanges", "fileName", "document", "changes", "dryRun", "editType", "context", "document", "changes", "errors", "prevDocument", "editType", "context", "changes", "prevDocument", "resultMsg", "editType", "resultMsg", "codeAfter", "$this", "editType", "fileNameToDocument", "context", "project", "updatedDocumentCopies", "fileNameToPath", "codeChanges", "dryRun", "$this", "editType", "fileNameToDocument", "context", "project", "updatedDocumentCopies", "fileNameToPath", "codeChanges", "session", "path", "dryRun", "$this", "editType", "fileNameToDocument", "context", "project", "updatedDocumentCopies", "fileNameToPath", "codeChanges", "session", "path", "dryRun", "$this", "editType", "fileNameToDocument", "context", "project", "updatedDocumentCopies", "codeChanges", "dryRun", "$this", "editType", "fileNameToDocument", "context", "project", "updatedDocumentCopies", "codeChanges", "semanticErrors", "$this", "editType", "fileNameToDocument", "context", "project", "codeChanges", "semanticErrors", "destination$iv$iv"}, m = "doSearchReplace$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSearchReplace")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditSearchReplace$doSearchReplace$4 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     Object L$7;
/*     */     Object L$8;
/*     */     Object L$9;
/*     */     Object L$10;
/*     */     Object L$11;
/*     */     Object L$12;
/*     */     boolean Z$0;
/*     */     int label;
/*     */     
/*     */     EditSearchReplace$doSearchReplace$4(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditSearchReplace.doSearchReplace$suspendImpl(EditSearchReplace.this, null, null, null, null, false, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditSearchReplace.kt", l = {148, 153, 158, 162}, i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"}, n = {"this", "context", "arguments", "result", "fileNameToDocument", "file", "dryRun", "this", "context", "arguments", "result", "fileNameToDocument", "file", "dryRun", "this", "context", "arguments", "result", "fileNameToDocument", "dryRun"}, m = "doSearchReplace", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSearchReplace")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditSearchReplace$doSearchReplace$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     boolean Z$0;
/*     */     int label;
/*     */     
/*     */     EditSearchReplace$doSearchReplace$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditSearchReplace.this.doSearchReplace(null, null, false, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditSearchReplace.kt", l = {366}, i = {0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, n = {"this", "executionContext", "project", "fileNameToDocument", "destination$iv$iv"}, m = "findSemanticErrors", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSearchReplace")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditSearchReplace$findSemanticErrors$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int label;
/*     */     
/*     */     EditSearchReplace$findSemanticErrors$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditSearchReplace.this.findSemanticErrors(null, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditSearchReplace.kt", l = {474, 493}, i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0"}, n = {"edit", "matchingResult", "agentSessionHistory", "msg", "document", "edit", "fileNameToDocument", "agentSessionHistory", "msg", "document", "idx"}, m = "formatErrorMessage$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSearchReplace")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditSearchReplace$formatErrorMessage$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     EditSearchReplace$formatErrorMessage$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditSearchReplace.formatErrorMessage$suspendImpl(EditSearchReplace.this, null, null, null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditSearchReplace.kt", l = {342}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"project", "fileNameToDocument", "editType", "destination$iv$iv"}, m = "getResultMessage", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSearchReplace")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditSearchReplace$getResultMessage$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     int label;
/*     */     
/*     */     EditSearchReplace$getResultMessage$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditSearchReplace.this.getResultMessage(null, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditSearchReplace.kt", l = {328}, i = {0, 0}, s = {"L$1", "Z$0"}, n = {"$this$resultFromErrorMessages_u24lambda_u2414", "hasMultipleEdits"}, m = "resultFromErrorMessages$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSearchReplace")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditSearchReplace$resultFromErrorMessages$1 extends ContinuationImpl {
/*     */     boolean Z$0;
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     EditSearchReplace$resultFromErrorMessages$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditSearchReplace.resultFromErrorMessages$suspendImpl(EditSearchReplace.this, null, null, null, false, false, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditSearchReplace.kt", l = {99}, i = {}, s = {}, n = {}, m = "reviewActionRequest$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSearchReplace")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditSearchReplace$reviewActionRequest$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     EditSearchReplace$reviewActionRequest$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditSearchReplace.reviewActionRequest$suspendImpl(EditSearchReplace.this, null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditSearchReplace.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */