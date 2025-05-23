/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ 
/*    */ import com.intellij.ide.actions.searcheverywhere.FoundItemDescriptor;
/*    */ import com.intellij.ide.util.gotoByName.ChooseByNameItemProvider;
/*    */ import com.intellij.ide.util.gotoByName.ChooseByNameViewModel;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.SmartPsiElementPointer;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\005\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\000\n\000\n\002\020!\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\004\030\000 #2\0020\001:\002#$B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J$\020\n\032\b\022\004\022\0020\f0\0132\006\020\r\032\0020\0162\006\020\017\032\0020\020H@¢\006\002\020\021J,\020\022\032\b\022\004\022\0020\0230\0132\006\020\r\032\0020\0162\006\020\024\032\0020\0252\006\020\026\032\0020\027H@¢\006\002\020\030J:\020\031\032\0020\0052\b\020\032\032\004\030\0010\0332\f\020\034\032\b\022\004\022\0020\0230\0352\b\020\036\032\004\030\0010\0372\006\020 \032\0020!2\006\020\"\032\0020!H\002R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\b\020\t¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractProjectSearcher;", "project", "Lcom/intellij/openapi/project/Project;", "allowDirectories", "", "<init>", "(Lcom/intellij/openapi/project/Project;Z)V", "getAllowDirectories", "()Z", "searchProject", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "query", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;", "disposable", "Lcom/intellij/openapi/Disposable;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/openapi/Disposable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findFiles", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$FoundFileWithWeight;", "itemProvider", "Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;", "viewModel", "Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addFileItem", "item", "", "result", "", "filter", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;", "limit", "", "weight", "Companion", "FoundFileWithWeight", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nFileProjectSearcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileProjectSearcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,88:1\n1557#2:89\n1628#2,3:90\n14#3:93\n*S KotlinDebug\n*F\n+ 1 FileProjectSearcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher\n*L\n35#1:89\n35#1:90,3\n24#1:93\n*E\n"})
/*    */ public final class FileProjectSearcher extends AbstractProjectSearcher {
/* 22 */   public FileProjectSearcher(@NotNull Project project, boolean allowDirectories) { super(project); this.allowDirectories = allowDirectories; } public final boolean getAllowDirectories() { return this.allowDirectories; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "ej-core"}) public static final class Companion {
/*    */     private Companion() {} } @NotNull
/* 24 */   public static final Companion Companion = new Companion(null); private final boolean allowDirectories; static { int $i$f$logger = 0;
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
/*    */ 
/*    */ 
/*    */     
/* 93 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(FileProjectSearcher.class), "getInstance(...)"); } @Nullable protected Object searchProject(@NotNull SearchQuery query, @NotNull Disposable paramDisposable, @NotNull Continuation $completion) { // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$searchProject$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$searchProject$1
/*    */     //   11: astore #18
/*    */     //   13: aload #18
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #18
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$searchProject$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #18
/*    */     //   50: aload #18
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #17
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #19
/*    */     //   62: aload #18
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 356, 0 -> 88, 1 -> 180
/*    */     //   88: aload #17
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: new com/intellij/ide/util/gotoByName/GotoFileModel
/*    */     //   96: dup
/*    */     //   97: aload_0
/*    */     //   98: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   101: invokespecial <init> : (Lcom/intellij/openapi/project/Project;)V
/*    */     //   104: astore #4
/*    */     //   106: new com/intellij/ml/llm/matterhorn/ej/core/services/search/BackgroundChooseByNameViewModel
/*    */     //   109: dup
/*    */     //   110: aload_0
/*    */     //   111: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   114: aload #4
/*    */     //   116: checkcast com/intellij/ide/util/gotoByName/ChooseByNameModel
/*    */     //   119: bipush #10
/*    */     //   121: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ide/util/gotoByName/ChooseByNameModel;I)V
/*    */     //   124: astore #5
/*    */     //   126: aload #4
/*    */     //   128: aconst_null
/*    */     //   129: invokevirtual getItemProvider : (Lcom/intellij/psi/PsiElement;)Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*    */     //   132: astore #7
/*    */     //   134: aload #7
/*    */     //   136: ldc 'getItemProvider(...)'
/*    */     //   138: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   141: aload #7
/*    */     //   143: astore #6
/*    */     //   145: aload_0
/*    */     //   146: aload_1
/*    */     //   147: aload #6
/*    */     //   149: aload #5
/*    */     //   151: checkcast com/intellij/ide/util/gotoByName/ChooseByNameViewModel
/*    */     //   154: aload #18
/*    */     //   156: aload #18
/*    */     //   158: aload_1
/*    */     //   159: putfield L$0 : Ljava/lang/Object;
/*    */     //   162: aload #18
/*    */     //   164: iconst_1
/*    */     //   165: putfield label : I
/*    */     //   168: invokespecial findFiles : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   171: dup
/*    */     //   172: aload #19
/*    */     //   174: if_acmpne -> 196
/*    */     //   177: aload #19
/*    */     //   179: areturn
/*    */     //   180: aload #18
/*    */     //   182: getfield L$0 : Ljava/lang/Object;
/*    */     //   185: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery
/*    */     //   188: astore_1
/*    */     //   189: aload #17
/*    */     //   191: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   194: aload #17
/*    */     //   196: checkcast java/lang/Iterable
/*    */     //   199: iconst_2
/*    */     //   200: anewarray kotlin/jvm/functions/Function1
/*    */     //   203: astore #7
/*    */     //   205: aload #7
/*    */     //   207: iconst_0
/*    */     //   208: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   213: aastore
/*    */     //   214: aload #7
/*    */     //   216: iconst_1
/*    */     //   217: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   222: aastore
/*    */     //   223: aload #7
/*    */     //   225: invokestatic compareBy : ([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
/*    */     //   228: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*    */     //   231: checkcast java/lang/Iterable
/*    */     //   234: aload_1
/*    */     //   235: invokevirtual getQueryLimit : ()I
/*    */     //   238: invokestatic take : (Ljava/lang/Iterable;I)Ljava/util/List;
/*    */     //   241: checkcast java/lang/Iterable
/*    */     //   244: astore #7
/*    */     //   246: iconst_0
/*    */     //   247: istore #8
/*    */     //   249: aload #7
/*    */     //   251: astore #9
/*    */     //   253: new java/util/ArrayList
/*    */     //   256: dup
/*    */     //   257: aload #7
/*    */     //   259: bipush #10
/*    */     //   261: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   264: invokespecial <init> : (I)V
/*    */     //   267: checkcast java/util/Collection
/*    */     //   270: astore #10
/*    */     //   272: iconst_0
/*    */     //   273: istore #11
/*    */     //   275: aload #9
/*    */     //   277: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   282: astore #12
/*    */     //   284: aload #12
/*    */     //   286: invokeinterface hasNext : ()Z
/*    */     //   291: ifeq -> 349
/*    */     //   294: aload #12
/*    */     //   296: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   301: astore #13
/*    */     //   303: aload #10
/*    */     //   305: aload #13
/*    */     //   307: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$FoundFileWithWeight
/*    */     //   310: astore #14
/*    */     //   312: astore #16
/*    */     //   314: iconst_0
/*    */     //   315: istore #15
/*    */     //   317: new com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem
/*    */     //   320: dup
/*    */     //   321: aload #14
/*    */     //   323: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   326: aconst_null
/*    */     //   327: aload #14
/*    */     //   329: invokevirtual getPsiPointer : ()Lcom/intellij/psi/SmartPsiElementPointer;
/*    */     //   332: iconst_2
/*    */     //   333: aconst_null
/*    */     //   334: invokespecial <init> : (Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultContent;Lcom/intellij/psi/SmartPsiElementPointer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   337: aload #16
/*    */     //   339: swap
/*    */     //   340: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   345: pop
/*    */     //   346: goto -> 284
/*    */     //   349: aload #10
/*    */     //   351: checkcast java/util/List
/*    */     //   354: nop
/*    */     //   355: areturn
/*    */     //   356: new java/lang/IllegalStateException
/*    */     //   359: dup
/*    */     //   360: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   362: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   365: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 60
/*    */     //   #28	-> 93
/*    */     //   #29	-> 106
/*    */     //   #30	-> 126
/*    */     //   #32	-> 145
/*    */     //   #27	-> 177
/*    */     //   #33	-> 199
/*    */     //   #34	-> 234
/*    */     //   #35	-> 246
/*    */     //   #89	-> 249
/*    */     //   #90	-> 275
/*    */     //   #91	-> 303
/*    */     //   #35	-> 317
/*    */     //   #91	-> 340
/*    */     //   #92	-> 349
/*    */     //   #89	-> 354
/*    */     //   #32	-> 355
/*    */     //   #27	-> 356
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	78	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;
/*    */     //   93	87	1	query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */     //   189	57	1	query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */     //   106	28	4	gotoModel	Lcom/intellij/ide/util/gotoByName/GotoFileModel;
/*    */     //   126	45	5	viewModel	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/BackgroundChooseByNameViewModel;
/*    */     //   145	26	6	itemProvider	Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*    */     //   246	26	7	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   272	12	9	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   272	79	10	destination$iv$iv	Ljava/util/Collection;
/*    */     //   303	43	13	item$iv$iv	Ljava/lang/Object;
/*    */     //   314	23	14	it	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$FoundFileWithWeight;
/*    */     //   317	20	15	$i$a$-map-FileProjectSearcher$searchProject$4	I
/*    */     //   275	76	11	$i$f$mapTo	I
/*    */     //   249	106	8	$i$f$map	I
/*    */     //   0	366	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	306	18	$continuation	Lkotlin/coroutines/Continuation;
/* 93 */     //   57	299	17	$result	Ljava/lang/Object; } @NotNull private static final Logger logger = Logger.getInstance(FileProjectSearcher.class);
/*    */   
/*    */   private static final Comparable searchProject$lambda$0(FoundFileWithWeight it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return Integer.valueOf(-it.getWeight());
/*    */   }
/*    */   
/*    */   private static final Comparable searchProject$lambda$1(FoundFileWithWeight it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return it.getFile().getName();
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\r\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B+\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\006\b\001\022\0020\0060\005j\002`\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J\t\020\022\032\0020\003HÆ\003J\025\020\023\032\016\022\006\b\001\022\0020\0060\005j\002`\007HÆ\003J\t\020\024\032\0020\tHÆ\003J3\020\025\032\0020\0002\b\b\002\020\002\032\0020\0032\024\b\002\020\004\032\016\022\006\b\001\022\0020\0060\005j\002`\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\tHÖ\001J\t\020\032\032\0020\033HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\035\020\004\032\016\022\006\b\001\022\0020\0060\005j\002`\007¢\006\b\n\000\032\004\b\016\020\017R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\020\020\021¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$FoundFileWithWeight;", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "psiPointer", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiElement;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiElementPointer;", "weight", "", "<init>", "(Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/psi/SmartPsiElementPointer;I)V", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getPsiPointer", "()Lcom/intellij/psi/SmartPsiElementPointer;", "getWeight", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ej-core"})
/*    */   private static final class FoundFileWithWeight {
/*    */     @NotNull
/*    */     private final VirtualFile file;
/*    */     @NotNull
/*    */     private final SmartPsiElementPointer<? extends PsiElement> psiPointer;
/*    */     private final int weight;
/*    */     
/*    */     public FoundFileWithWeight(@NotNull VirtualFile file, @NotNull SmartPsiElementPointer<? extends PsiElement> psiPointer, int weight) {
/*    */       this.file = file;
/*    */       this.psiPointer = psiPointer;
/*    */       this.weight = weight;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final VirtualFile getFile() {
/*    */       return this.file;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final SmartPsiElementPointer<? extends PsiElement> getPsiPointer() {
/*    */       return this.psiPointer;
/*    */     }
/*    */     
/*    */     public final int getWeight() {
/*    */       return this.weight;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final VirtualFile component1() {
/*    */       return this.file;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final SmartPsiElementPointer<? extends PsiElement> component2() {
/*    */       return this.psiPointer;
/*    */     }
/*    */     
/*    */     public final int component3() {
/*    */       return this.weight;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final FoundFileWithWeight copy(@NotNull VirtualFile file, @NotNull SmartPsiElementPointer<? extends PsiElement> psiPointer, int weight) {
/*    */       Intrinsics.checkNotNullParameter(file, "file");
/*    */       Intrinsics.checkNotNullParameter(psiPointer, "psiPointer");
/*    */       return new FoundFileWithWeight(file, psiPointer, weight);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "FoundFileWithWeight(file=" + this.file + ", psiPointer=" + this.psiPointer + ", weight=" + this.weight + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.file.hashCode();
/*    */       result = result * 31 + this.psiPointer.hashCode();
/*    */       return result * 31 + Integer.hashCode(this.weight);
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof FoundFileWithWeight))
/*    */         return false; 
/*    */       FoundFileWithWeight foundFileWithWeight = (FoundFileWithWeight)other;
/*    */       return !Intrinsics.areEqual(this.file, foundFileWithWeight.file) ? false : (!Intrinsics.areEqual(this.psiPointer, foundFileWithWeight.psiPointer) ? false : (!(this.weight != foundFileWithWeight.weight)));
/*    */     }
/*    */   }
/*    */   
/*    */   private final Object findFiles(SearchQuery query, ChooseByNameItemProvider itemProvider, ChooseByNameViewModel viewModel, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$findFiles$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$findFiles$1
/*    */     //   13: astore #8
/*    */     //   15: aload #8
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #8
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$findFiles$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #8
/*    */     //   53: aload #8
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #7
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #9
/*    */     //   65: aload #8
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 226, 0 -> 92, 1 -> 164
/*    */     //   92: aload #7
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: new java/util/ArrayList
/*    */     //   100: dup
/*    */     //   101: invokespecial <init> : ()V
/*    */     //   104: checkcast java/util/List
/*    */     //   107: astore #5
/*    */     //   109: nop
/*    */     //   110: aload_1
/*    */     //   111: invokevirtual getTimeoutMs : ()J
/*    */     //   114: new com/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$findFiles$2
/*    */     //   117: dup
/*    */     //   118: aload_0
/*    */     //   119: aload #5
/*    */     //   121: aload_2
/*    */     //   122: aload_3
/*    */     //   123: aload_1
/*    */     //   124: aconst_null
/*    */     //   125: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;Ljava/util/List;Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lkotlin/coroutines/Continuation;)V
/*    */     //   128: checkcast kotlin/jvm/functions/Function2
/*    */     //   131: aload #8
/*    */     //   133: aload #8
/*    */     //   135: aload_1
/*    */     //   136: putfield L$0 : Ljava/lang/Object;
/*    */     //   139: aload #8
/*    */     //   141: aload #5
/*    */     //   143: putfield L$1 : Ljava/lang/Object;
/*    */     //   146: aload #8
/*    */     //   148: iconst_1
/*    */     //   149: putfield label : I
/*    */     //   152: invokestatic withOptionalTimeout : (JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   155: dup
/*    */     //   156: aload #9
/*    */     //   158: if_acmpne -> 191
/*    */     //   161: aload #9
/*    */     //   163: areturn
/*    */     //   164: aload #8
/*    */     //   166: getfield L$1 : Ljava/lang/Object;
/*    */     //   169: checkcast java/util/List
/*    */     //   172: astore #5
/*    */     //   174: aload #8
/*    */     //   176: getfield L$0 : Ljava/lang/Object;
/*    */     //   179: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery
/*    */     //   182: astore_1
/*    */     //   183: nop
/*    */     //   184: aload #7
/*    */     //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   189: aload #7
/*    */     //   191: pop
/*    */     //   192: goto -> 223
/*    */     //   195: astore #6
/*    */     //   197: getstatic com/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   200: aload_1
/*    */     //   201: aload #5
/*    */     //   203: invokeinterface size : ()I
/*    */     //   208: aload_1
/*    */     //   209: invokevirtual getQueryLimit : ()I
/*    */     //   212: invokestatic min : (II)I
/*    */     //   215: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;I)Ljava/lang/String;
/*    */     //   220: invokevirtual warn : (Ljava/lang/String;)V
/*    */     //   223: aload #5
/*    */     //   225: areturn
/*    */     //   226: new java/lang/IllegalStateException
/*    */     //   229: dup
/*    */     //   230: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   232: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   235: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #40	-> 63
/*    */     //   #46	-> 97
/*    */     //   #46	-> 107
/*    */     //   #47	-> 109
/*    */     //   #48	-> 110
/*    */     //   #40	-> 161
/*    */     //   #48	-> 191
/*    */     //   #67	-> 195
/*    */     //   #68	-> 197
/*    */     //   #68	-> 220
/*    */     //   #70	-> 223
/*    */     //   #40	-> 226
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	10	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;
/*    */     //   107	48	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;
/*    */     //   97	67	1	query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */     //   183	9	1	query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */     //   195	20	1	query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */     //   97	10	2	itemProvider	Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*    */     //   107	48	2	itemProvider	Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*    */     //   97	10	3	viewModel	Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;
/*    */     //   107	48	3	viewModel	Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;
/*    */     //   109	55	5	result	Ljava/util/List;
/*    */     //   174	41	5	result	Ljava/util/List;
/*    */     //   215	11	5	result	Ljava/util/List;
/*    */     //   0	236	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	173	8	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	166	7	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   109	155	195	kotlinx/coroutines/TimeoutCancellationException
/*    */     //   183	192	195	kotlinx/coroutines/TimeoutCancellationException
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FileProjectSearcher.kt", l = {48}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"query", "result"}, m = "findFiles", c = "com.intellij.ml.llm.matterhorn.ej.core.services.search.FileProjectSearcher")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FileProjectSearcher$findFiles$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     FileProjectSearcher$findFiles$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FileProjectSearcher.this.findFiles((SearchQuery)null, (ChooseByNameItemProvider)null, (ChooseByNameViewModel)null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FileProjectSearcher.kt", l = {49}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.services.search.FileProjectSearcher$findFiles$2")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020!\n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$FoundFileWithWeight;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class FileProjectSearcher$findFiles$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<FoundFileWithWeight>>, Object> {
/*    */     int label;
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore_2
/*    */       //   4: aload_0
/*    */       //   5: getfield label : I
/*    */       //   8: tableswitch default -> 93, 0 -> 32, 1 -> 87
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: aload_0
/*    */       //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;
/*    */       //   40: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */       //   43: aload_0
/*    */       //   44: getfield $result : Ljava/util/List;
/*    */       //   47: aload_0
/*    */       //   48: getfield $itemProvider : Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*    */       //   51: aload_0
/*    */       //   52: getfield $viewModel : Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;
/*    */       //   55: aload_0
/*    */       //   56: getfield $query : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */       //   59: aload_0
/*    */       //   60: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;
/*    */       //   63: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;)Lkotlin/jvm/functions/Function0;
/*    */       //   68: aload_0
/*    */       //   69: checkcast kotlin/coroutines/Continuation
/*    */       //   72: aload_0
/*    */       //   73: iconst_1
/*    */       //   74: putfield label : I
/*    */       //   77: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   80: dup
/*    */       //   81: aload_2
/*    */       //   82: if_acmpne -> 92
/*    */       //   85: aload_2
/*    */       //   86: areturn
/*    */       //   87: aload_1
/*    */       //   88: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   91: aload_1
/*    */       //   92: areturn
/*    */       //   93: new java/lang/IllegalStateException
/*    */       //   96: dup
/*    */       //   97: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   99: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   102: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #48	-> 3
/*    */       //   #49	-> 36
/*    */       //   #48	-> 85
/*    */       //   #65	-> 92
/*    */       //   #48	-> 93
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	103	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$findFiles$2;
/*    */       //   36	57	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     private static final List invokeSuspend$lambda$4(List $result, ChooseByNameItemProvider $itemProvider, ChooseByNameViewModel $viewModel, SearchQuery $query, FileProjectSearcher this$0) {
/*    */       // Byte code:
/*    */       //   0: aload_0
/*    */       //   1: aload_1
/*    */       //   2: aload_2
/*    */       //   3: aload_3
/*    */       //   4: aload #4
/*    */       //   6: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;)Lkotlin/jvm/functions/Function0;
/*    */       //   11: invokestatic blockingContextToIndicator : (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*    */       //   14: checkcast java/util/List
/*    */       //   17: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #50	-> 0
/*    */       //   #64	-> 17
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	18	0	$result	Ljava/util/List;
/*    */       //   0	18	1	$itemProvider	Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*    */       //   0	18	2	$viewModel	Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;
/*    */       //   0	18	3	$query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */       //   0	18	4	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;
/*    */     }
/*    */     
/*    */     private static final List invokeSuspend$lambda$4$lambda$3(List $result, ChooseByNameItemProvider $itemProvider, ChooseByNameViewModel $viewModel, SearchQuery $query, FileProjectSearcher this$0) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getGlobalProgressIndicator : ()Lcom/intellij/openapi/progress/ProgressIndicator;
/*    */       //   3: astore #5
/*    */       //   5: aload_0
/*    */       //   6: invokeinterface clear : ()V
/*    */       //   11: aload_1
/*    */       //   12: instanceof com/intellij/ide/util/gotoByName/ChooseByNameWeightedItemProvider
/*    */       //   15: ifeq -> 52
/*    */       //   18: aload_1
/*    */       //   19: checkcast com/intellij/ide/util/gotoByName/ChooseByNameWeightedItemProvider
/*    */       //   22: aload_2
/*    */       //   23: aload_3
/*    */       //   24: invokevirtual getQuery : ()Ljava/lang/String;
/*    */       //   27: iconst_0
/*    */       //   28: aload #5
/*    */       //   30: aload #4
/*    */       //   32: aload_0
/*    */       //   33: aload_3
/*    */       //   34: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;)Lkotlin/jvm/functions/Function1;
/*    */       //   39: <illegal opcode> process : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/util/Processor;
/*    */       //   44: invokeinterface filterElementsWithWeights : (Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;Ljava/lang/String;ZLcom/intellij/openapi/progress/ProgressIndicator;Lcom/intellij/util/Processor;)Z
/*    */       //   49: goto -> 75
/*    */       //   52: aload_1
/*    */       //   53: aload_2
/*    */       //   54: aload_3
/*    */       //   55: invokevirtual getQuery : ()Ljava/lang/String;
/*    */       //   58: iconst_0
/*    */       //   59: aload #5
/*    */       //   61: aload #4
/*    */       //   63: aload_0
/*    */       //   64: aload_3
/*    */       //   65: <illegal opcode> process : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;)Lcom/intellij/util/Processor;
/*    */       //   70: invokeinterface filterElements : (Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;Ljava/lang/String;ZLcom/intellij/openapi/progress/ProgressIndicator;Lcom/intellij/util/Processor;)Z
/*    */       //   75: pop
/*    */       //   76: aload_0
/*    */       //   77: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #51	-> 0
/*    */       //   #52	-> 5
/*    */       //   #53	-> 11
/*    */       //   #54	-> 12
/*    */       //   #55	-> 18
/*    */       //   #59	-> 52
/*    */       //   #63	-> 76
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   5	73	5	progressIndicator	Lcom/intellij/openapi/progress/ProgressIndicator;
/*    */       //   0	78	0	$result	Ljava/util/List;
/*    */       //   0	78	1	$itemProvider	Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*    */       //   0	78	2	$viewModel	Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;
/*    */       //   0	78	3	$query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */       //   0	78	4	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;
/*    */     }
/*    */     
/*    */     private static final boolean invokeSuspend$lambda$4$lambda$3$lambda$1(Function1 $tmp0, Object p0) {
/*    */       return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*    */     }
/*    */     
/*    */     private static final boolean invokeSuspend$lambda$4$lambda$3$lambda$0(FileProjectSearcher this$0, List $result, SearchQuery $query, FoundItemDescriptor it) {
/*    */       return FileProjectSearcher.this.addFileItem(it.getItem(), $result, $query.getFilter(), $query.getQueryLimit(), it.getWeight());
/*    */     }
/*    */     
/*    */     private static final boolean invokeSuspend$lambda$4$lambda$3$lambda$2(FileProjectSearcher this$0, List $result, SearchQuery $query, Object it) {
/*    */       return FileProjectSearcher.this.addFileItem(it, $result, $query.getFilter(), $query.getQueryLimit(), 1);
/*    */     }
/*    */     
/*    */     FileProjectSearcher$findFiles$2(List<FileProjectSearcher.FoundFileWithWeight> $result, ChooseByNameItemProvider $itemProvider, ChooseByNameViewModel $viewModel, SearchQuery $query, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super FileProjectSearcher$findFiles$2> $completion) {
/*    */       return (Continuation<Unit>)new FileProjectSearcher$findFiles$2(this.$result, this.$itemProvider, this.$viewModel, this.$query, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((FileProjectSearcher$findFiles$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   private final boolean addFileItem(Object item, List<FoundFileWithWeight> result, SearchResultsFilter filter, int limit, int weight) {
/*    */     if (item instanceof PsiFile && checkFile(filter, (PsiFile)item)) {
/*    */       Intrinsics.checkNotNullExpressionValue(((PsiFile)item).getVirtualFile(), "getVirtualFile(...)");
/*    */       result.add(new FoundFileWithWeight(((PsiFile)item).getVirtualFile(), SmartPointersKt.createSmartPointer((PsiElement)item), weight));
/*    */     } else if (this.allowDirectories && item instanceof PsiDirectory) {
/*    */       Intrinsics.checkNotNullExpressionValue(((PsiDirectory)item).getVirtualFile(), "getVirtualFile(...)");
/*    */       result.add(new FoundFileWithWeight(((PsiDirectory)item).getVirtualFile(), SmartPointersKt.createSmartPointer((PsiElement)item), weight));
/*    */     } 
/*    */     return (result.size() < limit);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FileProjectSearcher.kt", l = {32}, i = {0}, s = {"L$0"}, n = {"query"}, m = "searchProject", c = "com.intellij.ml.llm.matterhorn.ej.core.services.search.FileProjectSearcher")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FileProjectSearcher$searchProject$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     FileProjectSearcher$searchProject$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FileProjectSearcher.this.searchProject((SearchQuery)null, (Disposable)null, (Continuation<? super List<SearchResultItem>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\FileProjectSearcher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */