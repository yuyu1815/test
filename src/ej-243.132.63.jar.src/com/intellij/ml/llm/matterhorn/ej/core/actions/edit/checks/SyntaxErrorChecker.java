/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\"\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\030\000 \0212\0020\001:\001\021B\031\b\007\022\016\b\002\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J$\020\007\032\b\022\004\022\0020\t0\b2\006\020\n\032\0020\0132\006\020\f\032\0020\rH@¢\006\002\020\016J\036\020\017\032\b\022\004\022\0020\t0\b2\006\020\020\032\0020\0042\006\020\f\032\0020\rH\002R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxErrorChecker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker;", "supportedExtensions", "", "", "<init>", "(Ljava/util/Set;)V", "findErrors", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/psi/PsiFile;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extensionCustomChecks", "extension", "Companion", "ej-core"})
/*    */ public final class SyntaxErrorChecker implements SyntaxChecker {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Set<String> supportedExtensions;
/*    */   @NotNull
/*    */   public static final String CELL_MARKER = "#%%";
/*    */   @NotNull
/*    */   public static final String RAW_CELL_SUFFIX = " raw";
/*    */   
/*    */   @VisibleForTesting
/*    */   @JvmOverloads
/* 24 */   public SyntaxErrorChecker(@NotNull Set<String> supportedExtensions) { this.supportedExtensions = supportedExtensions; }
/*    */   @NotNull public static final String MARKDOWN_CELL_SUFFIX = " md"; @NotNull public static final String SQL_CELL_SUFFIX = " sql"; @NotNull public static final String HEADING_CELL_SUFFIX = " heading"; @NotNull public static final String HTML_CELL_SUFFIX = " html"; @NotNull public String getNameForLogging() { return SyntaxChecker.DefaultImpls.getNameForLogging(this); } @VisibleForTesting @JvmOverloads
/* 26 */   public SyntaxErrorChecker() { this(null, 1, null); }
/*    */ 
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\006\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\005XT¢\006\002\n\000R\016\020\t\032\0020\005XT¢\006\002\n\000R\016\020\n\032\0020\005XT¢\006\002\n\000¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxErrorChecker$Companion;", "", "<init>", "()V", "CELL_MARKER", "", "RAW_CELL_SUFFIX", "MARKDOWN_CELL_SUFFIX", "SQL_CELL_SUFFIX", "HEADING_CELL_SUFFIX", "HTML_CELL_SUFFIX", "ej-core"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object findErrors(@NotNull Project project, @NotNull PsiFile file, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxErrorChecker$findErrors$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxErrorChecker$findErrors$1
/*    */     //   11: astore #6
/*    */     //   13: aload #6
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #6
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxErrorChecker$findErrors$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxErrorChecker;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 272, 0 -> 92, 1 -> 181, 2 -> 264
/*    */     //   92: aload #5
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_2
/*    */     //   98: invokeinterface getOriginalFile : ()Lcom/intellij/psi/PsiFile;
/*    */     //   103: invokeinterface getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   108: invokevirtual getExtension : ()Ljava/lang/String;
/*    */     //   111: astore #4
/*    */     //   113: aload #4
/*    */     //   115: ifnull -> 132
/*    */     //   118: aload_0
/*    */     //   119: getfield supportedExtensions : Ljava/util/Set;
/*    */     //   122: aload #4
/*    */     //   124: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   129: ifne -> 136
/*    */     //   132: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   135: areturn
/*    */     //   136: aload_1
/*    */     //   137: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function0;
/*    */     //   142: aload #6
/*    */     //   144: aload #6
/*    */     //   146: aload_0
/*    */     //   147: putfield L$0 : Ljava/lang/Object;
/*    */     //   150: aload #6
/*    */     //   152: aload_2
/*    */     //   153: putfield L$1 : Ljava/lang/Object;
/*    */     //   156: aload #6
/*    */     //   158: aload #4
/*    */     //   160: putfield L$2 : Ljava/lang/Object;
/*    */     //   163: aload #6
/*    */     //   165: iconst_1
/*    */     //   166: putfield label : I
/*    */     //   169: invokestatic edtWriteAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   172: dup
/*    */     //   173: aload #7
/*    */     //   175: if_acmpne -> 216
/*    */     //   178: aload #7
/*    */     //   180: areturn
/*    */     //   181: aload #6
/*    */     //   183: getfield L$2 : Ljava/lang/Object;
/*    */     //   186: checkcast java/lang/String
/*    */     //   189: astore #4
/*    */     //   191: aload #6
/*    */     //   193: getfield L$1 : Ljava/lang/Object;
/*    */     //   196: checkcast com/intellij/psi/PsiFile
/*    */     //   199: astore_2
/*    */     //   200: aload #6
/*    */     //   202: getfield L$0 : Ljava/lang/Object;
/*    */     //   205: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxErrorChecker
/*    */     //   208: astore_0
/*    */     //   209: aload #5
/*    */     //   211: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   214: aload #5
/*    */     //   216: pop
/*    */     //   217: aload_0
/*    */     //   218: aload #4
/*    */     //   220: aload_2
/*    */     //   221: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxErrorChecker;Ljava/lang/String;Lcom/intellij/psi/PsiFile;)Lkotlin/jvm/functions/Function0;
/*    */     //   226: aload #6
/*    */     //   228: aload #6
/*    */     //   230: aconst_null
/*    */     //   231: putfield L$0 : Ljava/lang/Object;
/*    */     //   234: aload #6
/*    */     //   236: aconst_null
/*    */     //   237: putfield L$1 : Ljava/lang/Object;
/*    */     //   240: aload #6
/*    */     //   242: aconst_null
/*    */     //   243: putfield L$2 : Ljava/lang/Object;
/*    */     //   246: aload #6
/*    */     //   248: iconst_2
/*    */     //   249: putfield label : I
/*    */     //   252: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   255: dup
/*    */     //   256: aload #7
/*    */     //   258: if_acmpne -> 271
/*    */     //   261: aload #7
/*    */     //   263: areturn
/*    */     //   264: aload #5
/*    */     //   266: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   269: aload #5
/*    */     //   271: areturn
/*    */     //   272: new java/lang/IllegalStateException
/*    */     //   275: dup
/*    */     //   276: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   278: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   281: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #37	-> 60
/*    */     //   #38	-> 97
/*    */     //   #39	-> 113
/*    */     //   #40	-> 132
/*    */     //   #42	-> 136
/*    */     //   #37	-> 178
/*    */     //   #45	-> 216
/*    */     //   #37	-> 261
/*    */     //   #45	-> 271
/*    */     //   #37	-> 272
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	35	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxErrorChecker;
/*    */     //   136	45	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxErrorChecker;
/*    */     //   209	46	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxErrorChecker;
/*    */     //   97	35	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   136	36	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   97	35	2	file	Lcom/intellij/psi/PsiFile;
/*    */     //   136	45	2	file	Lcom/intellij/psi/PsiFile;
/*    */     //   200	55	2	file	Lcom/intellij/psi/PsiFile;
/*    */     //   113	19	4	extension	Ljava/lang/String;
/*    */     //   136	45	4	extension	Ljava/lang/String;
/*    */     //   191	64	4	extension	Ljava/lang/String;
/*    */     //   0	282	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	222	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	215	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private static final Unit findErrors$lambda$0(Project $project) {
/* 43 */     PsiDocumentManager.getInstance($project).commitAllDocuments();
/* 44 */     return Unit.INSTANCE;
/*    */   } private static final List findErrors$lambda$1(SyntaxErrorChecker this$0, String $extension, PsiFile $file) {
/* 46 */     List<Error> errorList = new ArrayList();
/* 47 */     errorList.addAll(this$0.extensionCustomChecks($extension, $file));
/*    */     
/* 49 */     Intrinsics.checkNotNullExpressionValue(SyntaxTraverser.psiTraverser((PsiElement)$file).iterator(), "iterator(...)"); for (PsiElement element : SyntaxTraverser.psiTraverser((PsiElement)$file)) {
/* 50 */       if (element instanceof PsiErrorElement) {
/* 51 */         int offset = ((PsiErrorElement)element).getTextOffset();
/* 52 */         Intrinsics.checkNotNullExpressionValue(((PsiErrorElement)element).getErrorDescription(), "getErrorDescription(...)"); String errorDescription = ((PsiErrorElement)element).getErrorDescription();
/* 53 */         errorList.add(new OffsetError(offset, errorDescription));
/*    */       } 
/*    */     } 
/* 56 */     return errorList;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final List<Error> extensionCustomChecks(String extension, PsiFile file) {
/* 63 */     Intrinsics.checkNotNullExpressionValue(file.getText(), "getText(...)"); return Intrinsics.areEqual(extension, "ipynb") ? (!StringsKt.startsWith$default(file.getText(), "#%%", false, 2, null) ? 
/* 64 */       CollectionsKt.listOf(new OffsetError(0, "Rules for .ipynb files syntax:\nNotebook must start with a valid cell marker in separate line, for example:\n- for code cell:\n#%%\n\n- for markdown cell:\n#%% md\n\nEach notebook cell must be preceded by separate line with valid cell marker\nHere is list of valid cell markers:\n#%%\n#%% raw\n#%% md\n#%% sql\n#%% html\n#%% heading\n")) : 
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
/* 78 */       CollectionsKt.emptyList()) : 
/*    */       
/* 80 */       CollectionsKt.emptyList();
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SyntaxChecker.kt", l = {42, 45}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "file", "extension"}, m = "findErrors", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.SyntaxErrorChecker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class SyntaxErrorChecker$findErrors$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     SyntaxErrorChecker$findErrors$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SyntaxErrorChecker.this.findErrors(null, null, (Continuation<? super List<? extends Error>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\SyntaxErrorChecker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */