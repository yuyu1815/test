/*     */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*     */ 
/*     */ import com.intellij.ide.actions.searcheverywhere.FoundItemDescriptor;
/*     */ import com.intellij.ide.util.gotoByName.ChooseByNameItemProvider;
/*     */ import com.intellij.ide.util.gotoByName.ChooseByNameViewModel;
/*     */ import com.intellij.ide.util.gotoByName.ContributorsBasedGotoByModel;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.psi.SmartPsiElementPointer;
/*     */ import com.intellij.util.concurrency.annotations.RequiresReadLock;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020!\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b&\030\000 .2\0020\001:\002./B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\006\032\0020\0072\006\020\b\032\0020\tH&J\020\020\017\032\0020\0202\006\020\021\032\0020\020H\024J\020\020\022\032\0020\0232\006\020\021\032\0020\020H\026J$\020\024\032\b\022\004\022\0020\0250\0132\006\020\021\032\0020\0202\006\020\b\032\0020\tH@¢\006\002\020\026J>\020\027\032\0020\0302\006\020\021\032\0020\0202\006\020\031\032\0020\0072\006\020\032\032\0020\0332\006\020\034\032\0020\0352\006\020\036\032\0020\0372\f\020 \032\b\022\004\022\0020\"0!H\003J8\020#\032\0020\0232\b\020$\032\004\030\0010%2\f\020 \032\b\022\004\022\0020\"0!2\006\020\031\032\0020\0072\006\020\021\032\0020\0202\006\020&\032\0020'H\003J \020(\032\0020\"2\006\020$\032\0020)2\006\020*\032\0020\f2\006\020&\032\0020'H\003J\030\020+\032\0020\023*\004\030\0010,2\b\020-\032\004\030\0010)H\002R\030\020\n\032\b\022\004\022\0020\f0\013X¦\004¢\006\006\032\004\b\r\020\016¨\0060"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractProjectSearcher;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "getContributorsBasedGotoByModel", "Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;", "disposable", "Lcom/intellij/openapi/Disposable;", "prefixToReplace", "", "", "getPrefixToReplace", "()Ljava/util/List;", "enhanceSearchQuery", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;", "query", "detectSearchQuery", "", "searchProject", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/openapi/Disposable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findClassOrPsiElement", "", "gotoModel", "itemProvider", "Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;", "viewModel", "Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;", "progressIndicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "result", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher$FoundPsiItemWithWeight;", "addClassOrPsiElement", "item", "", "weight", "", "getFoundPsiItemWithWeight", "Lcom/intellij/psi/PsiElement;", "name", "checkContainingFile", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;", "psiElement", "Companion", "FoundPsiItemWithWeight", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAbstractSymbolProjectSearcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSymbolProjectSearcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,159:1\n1863#2,2:160\n1755#2,3:162\n1557#2:165\n1628#2,3:166\n1#3:169\n14#4:170\n*S KotlinDebug\n*F\n+ 1 AbstractSymbolProjectSearcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher\n*L\n41#1:160,2\n50#1:162,3\n75#1:165\n75#1:166,3\n32#1:170\n*E\n"})
/*     */ public abstract class AbstractSymbolProjectSearcher extends AbstractProjectSearcher {
/*  30 */   public AbstractSymbolProjectSearcher(@NotNull Project project) { super(project); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "ej-core"}) public static final class Companion {
/*     */     private Companion() {} } @NotNull
/*  32 */   public static final Companion Companion = new Companion(null); static { int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(AbstractSymbolProjectSearcher.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(AbstractSymbolProjectSearcher.class);
/*     */   
/*     */   @NotNull
/*     */   protected SearchQuery enhanceSearchQuery(@NotNull SearchQuery query) {
/*     */     Intrinsics.checkNotNullParameter(query, "query");
/*     */     Object queryEnhanced = null;
/*     */     queryEnhanced = query.getQuery();
/*     */     Iterable<String> $this$forEach$iv = getPrefixToReplace();
/*     */     int $i$f$forEach = 0;
/*     */     Iterator<String> iterator = $this$forEach$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       String it = (String)element$iv;
/*     */       int $i$a$-forEach-AbstractSymbolProjectSearcher$enhanceSearchQuery$1 = 0;
/*     */       if (StringsKt.startsWith$default((String)queryEnhanced, it, false, 2, null))
/*     */         queryEnhanced = StringsKt.removePrefix((String)queryEnhanced, it); 
/*     */     } 
/*     */     return SearchQuery.copy$default(query, (String)queryEnhanced, 0, 0L, null, 14, null);
/*     */   }
/*     */   
/*     */   public boolean detectSearchQuery(@NotNull SearchQuery query) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'query'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: invokevirtual getPrefixToReplace : ()Ljava/util/List;
/*     */     //   10: checkcast java/lang/Iterable
/*     */     //   13: astore_2
/*     */     //   14: iconst_0
/*     */     //   15: istore_3
/*     */     //   16: aload_2
/*     */     //   17: instanceof java/util/Collection
/*     */     //   20: ifeq -> 39
/*     */     //   23: aload_2
/*     */     //   24: checkcast java/util/Collection
/*     */     //   27: invokeinterface isEmpty : ()Z
/*     */     //   32: ifeq -> 39
/*     */     //   35: iconst_0
/*     */     //   36: goto -> 116
/*     */     //   39: aload_2
/*     */     //   40: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   45: astore #4
/*     */     //   47: aload #4
/*     */     //   49: invokeinterface hasNext : ()Z
/*     */     //   54: ifeq -> 115
/*     */     //   57: aload #4
/*     */     //   59: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   64: astore #5
/*     */     //   66: aload #5
/*     */     //   68: checkcast java/lang/String
/*     */     //   71: astore #6
/*     */     //   73: iconst_0
/*     */     //   74: istore #7
/*     */     //   76: aload_1
/*     */     //   77: invokevirtual getQuery : ()Ljava/lang/String;
/*     */     //   80: aload #6
/*     */     //   82: iconst_0
/*     */     //   83: iconst_2
/*     */     //   84: aconst_null
/*     */     //   85: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   88: ifeq -> 107
/*     */     //   91: aload_1
/*     */     //   92: invokevirtual getQuery : ()Ljava/lang/String;
/*     */     //   95: aload #6
/*     */     //   97: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   100: ifne -> 107
/*     */     //   103: iconst_1
/*     */     //   104: goto -> 108
/*     */     //   107: iconst_0
/*     */     //   108: ifeq -> 47
/*     */     //   111: iconst_1
/*     */     //   112: goto -> 116
/*     */     //   115: iconst_0
/*     */     //   116: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 6
/*     */     //   #162	-> 16
/*     */     //   #163	-> 39
/*     */     //   #51	-> 76
/*     */     //   #163	-> 108
/*     */     //   #164	-> 115
/*     */     //   #52	-> 116
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   76	32	7	$i$a$-any-AbstractSymbolProjectSearcher$detectSearchQuery$1	I
/*     */     //   73	35	6	it	Ljava/lang/String;
/*     */     //   66	49	5	element$iv	Ljava/lang/Object;
/*     */     //   16	100	3	$i$f$any	I
/*     */     //   14	102	2	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   0	117	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;
/*     */     //   0	117	1	query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractSymbolProjectSearcher.kt", l = {62}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.services.search.AbstractSymbolProjectSearcher$searchProject$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AbstractSymbolProjectSearcher$searchProject$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 101, 0 -> 32, 1 -> 91
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;
/*     */       //   40: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */       //   43: aload_0
/*     */       //   44: getfield $result : Ljava/util/List;
/*     */       //   47: aload_0
/*     */       //   48: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;
/*     */       //   51: aload_0
/*     */       //   52: getfield $query : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*     */       //   55: aload_0
/*     */       //   56: getfield $gotoModel : Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;
/*     */       //   59: aload_0
/*     */       //   60: getfield $itemProvider : Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*     */       //   63: aload_0
/*     */       //   64: getfield $viewModel : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/BackgroundChooseByNameViewModel;
/*     */       //   67: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/BackgroundChooseByNameViewModel;)Lkotlin/jvm/functions/Function0;
/*     */       //   72: aload_0
/*     */       //   73: checkcast kotlin/coroutines/Continuation
/*     */       //   76: aload_0
/*     */       //   77: iconst_1
/*     */       //   78: putfield label : I
/*     */       //   81: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   84: dup
/*     */       //   85: aload_2
/*     */       //   86: if_acmpne -> 96
/*     */       //   89: aload_2
/*     */       //   90: areturn
/*     */       //   91: aload_1
/*     */       //   92: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   95: aload_1
/*     */       //   96: pop
/*     */       //   97: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   100: areturn
/*     */       //   101: new java/lang/IllegalStateException
/*     */       //   104: dup
/*     */       //   105: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   107: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   110: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #61	-> 3
/*     */       //   #62	-> 36
/*     */       //   #61	-> 89
/*     */       //   #69	-> 96
/*     */       //   #61	-> 101
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	111	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher$searchProject$2;
/*     */       //   36	65	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$1(List $result, AbstractSymbolProjectSearcher this$0, SearchQuery $query, ContributorsBasedGotoByModel $gotoModel, ChooseByNameItemProvider $itemProvider, BackgroundChooseByNameViewModel $viewModel) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: aload_1
/*     */       //   2: aload_2
/*     */       //   3: aload_3
/*     */       //   4: aload #4
/*     */       //   6: aload #5
/*     */       //   8: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/BackgroundChooseByNameViewModel;)Lkotlin/jvm/functions/Function0;
/*     */       //   13: invokestatic blockingContextToIndicator : (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*     */       //   16: pop
/*     */       //   17: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   20: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #63	-> 0
/*     */       //   #68	-> 17
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	21	0	$result	Ljava/util/List;
/*     */       //   0	21	1	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;
/*     */       //   0	21	2	$query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*     */       //   0	21	3	$gotoModel	Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;
/*     */       //   0	21	4	$itemProvider	Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*     */       //   0	21	5	$viewModel	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/BackgroundChooseByNameViewModel;
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$1$lambda$0(List $result, AbstractSymbolProjectSearcher this$0, SearchQuery $query, ContributorsBasedGotoByModel $gotoModel, ChooseByNameItemProvider $itemProvider, BackgroundChooseByNameViewModel $viewModel) {
/*     */       ProgressIndicator progressIndicator = ProgressManager.getGlobalProgressIndicator();
/*     */       $result.clear();
/*     */       Intrinsics.checkNotNull(progressIndicator);
/*     */       AbstractSymbolProjectSearcher.this.findClassOrPsiElement($query, $gotoModel, $itemProvider, $viewModel, progressIndicator, $result);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     AbstractSymbolProjectSearcher$searchProject$2(List<AbstractSymbolProjectSearcher.FoundPsiItemWithWeight> $result, SearchQuery $query, ContributorsBasedGotoByModel $gotoModel, ChooseByNameItemProvider $itemProvider, BackgroundChooseByNameViewModel $viewModel, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AbstractSymbolProjectSearcher$searchProject$2> $completion) {
/*     */       return (Continuation<Unit>)new AbstractSymbolProjectSearcher$searchProject$2(this.$result, this.$query, this.$gotoModel, this.$itemProvider, this.$viewModel, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AbstractSymbolProjectSearcher$searchProject$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Comparable searchProject$lambda$2(FoundPsiItemWithWeight it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return Integer.valueOf(-it.getWeight());
/*     */   }
/*     */   
/*     */   private static final Comparable searchProject$lambda$3(FoundPsiItemWithWeight it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getName();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\023\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001BE\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\t\022\030\b\002\020\n\032\022\022\006\b\001\022\0020\f\030\0010\013j\004\030\001`\r¢\006\004\b\016\020\017J\t\020\032\032\0020\003HÆ\003J\t\020\033\032\0020\005HÆ\003J\t\020\034\032\0020\007HÆ\003J\013\020\035\032\004\030\0010\tHÆ\003J\031\020\036\032\022\022\006\b\001\022\0020\f\030\0010\013j\004\030\001`\rHÆ\003JM\020\037\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\t2\030\b\002\020\n\032\022\022\006\b\001\022\0020\f\030\0010\013j\004\030\001`\rHÆ\001J\023\020 \032\0020!2\b\020\"\032\004\030\0010\001HÖ\003J\t\020#\032\0020\005HÖ\001J\t\020$\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\026\020\027R!\020\n\032\022\022\006\b\001\022\0020\f\030\0010\013j\004\030\001`\r¢\006\b\n\000\032\004\b\030\020\031¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher$FoundPsiItemWithWeight;", "", "name", "", "weight", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "content", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultContent;", "pointer", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiElement;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiElementPointer;", "<init>", "(Ljava/lang/String;ILcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultContent;Lcom/intellij/psi/SmartPsiElementPointer;)V", "getName", "()Ljava/lang/String;", "getWeight", "()I", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getContent", "()Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultContent;", "getPointer", "()Lcom/intellij/psi/SmartPsiElementPointer;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ej-core"})
/*     */   private static final class FoundPsiItemWithWeight {
/*     */     @NotNull
/*     */     private final String name;
/*     */     private final int weight;
/*     */     @NotNull
/*     */     private final VirtualFile file;
/*     */     @Nullable
/*     */     private final SearchResultContent content;
/*     */     @Nullable
/*     */     private final SmartPsiElementPointer<? extends PsiElement> pointer;
/*     */     
/*     */     public FoundPsiItemWithWeight(@NotNull String name, int weight, @NotNull VirtualFile file, @Nullable SearchResultContent content, @Nullable SmartPsiElementPointer<? extends PsiElement> pointer) {
/*     */       this.name = name;
/*     */       this.weight = weight;
/*     */       this.file = file;
/*     */       this.content = content;
/*     */       this.pointer = pointer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getName() {
/*     */       return this.name;
/*     */     }
/*     */     
/*     */     public final int getWeight() {
/*     */       return this.weight;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final VirtualFile getFile() {
/*     */       return this.file;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final SearchResultContent getContent() {
/*     */       return this.content;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final SmartPsiElementPointer<? extends PsiElement> getPointer() {
/*     */       return this.pointer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component1() {
/*     */       return this.name;
/*     */     }
/*     */     
/*     */     public final int component2() {
/*     */       return this.weight;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final VirtualFile component3() {
/*     */       return this.file;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final SearchResultContent component4() {
/*     */       return this.content;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final SmartPsiElementPointer<? extends PsiElement> component5() {
/*     */       return this.pointer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final FoundPsiItemWithWeight copy(@NotNull String name, int weight, @NotNull VirtualFile file, @Nullable SearchResultContent content, @Nullable SmartPsiElementPointer<? extends PsiElement> pointer) {
/*     */       Intrinsics.checkNotNullParameter(name, "name");
/*     */       Intrinsics.checkNotNullParameter(file, "file");
/*     */       return new FoundPsiItemWithWeight(name, weight, file, content, pointer);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "FoundPsiItemWithWeight(name=" + this.name + ", weight=" + this.weight + ", file=" + this.file + ", content=" + this.content + ", pointer=" + this.pointer + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.name.hashCode();
/*     */       result = result * 31 + Integer.hashCode(this.weight);
/*     */       result = result * 31 + this.file.hashCode();
/*     */       result = result * 31 + ((this.content == null) ? 0 : this.content.hashCode());
/*     */       return result * 31 + ((this.pointer == null) ? 0 : this.pointer.hashCode());
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof FoundPsiItemWithWeight))
/*     */         return false; 
/*     */       FoundPsiItemWithWeight foundPsiItemWithWeight = (FoundPsiItemWithWeight)other;
/*     */       return !Intrinsics.areEqual(this.name, foundPsiItemWithWeight.name) ? false : ((this.weight != foundPsiItemWithWeight.weight) ? false : (!Intrinsics.areEqual(this.file, foundPsiItemWithWeight.file) ? false : (!Intrinsics.areEqual(this.content, foundPsiItemWithWeight.content) ? false : (!!Intrinsics.areEqual(this.pointer, foundPsiItemWithWeight.pointer)))));
/*     */     }
/*     */   }
/*     */   
/*     */   @RequiresReadLock
/*     */   private final void findClassOrPsiElement(SearchQuery query, ContributorsBasedGotoByModel gotoModel, ChooseByNameItemProvider itemProvider, ChooseByNameViewModel viewModel, ProgressIndicator progressIndicator, List result) {
/*     */     // Byte code:
/*     */     //   0: nop
/*     */     //   1: aload_3
/*     */     //   2: instanceof com/intellij/ide/util/gotoByName/ChooseByNameWeightedItemProvider
/*     */     //   5: ifeq -> 44
/*     */     //   8: aload_3
/*     */     //   9: checkcast com/intellij/ide/util/gotoByName/ChooseByNameWeightedItemProvider
/*     */     //   12: aload #4
/*     */     //   14: aload_1
/*     */     //   15: invokevirtual getQuery : ()Ljava/lang/String;
/*     */     //   18: iconst_0
/*     */     //   19: aload #5
/*     */     //   21: aload_0
/*     */     //   22: aload #6
/*     */     //   24: aload_2
/*     */     //   25: aload_1
/*     */     //   26: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;Ljava/util/List;Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;)Lkotlin/jvm/functions/Function1;
/*     */     //   31: <illegal opcode> process : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/util/Processor;
/*     */     //   36: invokeinterface filterElementsWithWeights : (Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;Ljava/lang/String;ZLcom/intellij/openapi/progress/ProgressIndicator;Lcom/intellij/util/Processor;)Z
/*     */     //   41: goto -> 69
/*     */     //   44: aload_3
/*     */     //   45: aload #4
/*     */     //   47: aload_1
/*     */     //   48: invokevirtual getQuery : ()Ljava/lang/String;
/*     */     //   51: iconst_0
/*     */     //   52: aload #5
/*     */     //   54: aload_0
/*     */     //   55: aload #6
/*     */     //   57: aload_2
/*     */     //   58: aload_1
/*     */     //   59: <illegal opcode> process : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;Ljava/util/List;Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;)Lcom/intellij/util/Processor;
/*     */     //   64: invokeinterface filterElements : (Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;Ljava/lang/String;ZLcom/intellij/openapi/progress/ProgressIndicator;Lcom/intellij/util/Processor;)Z
/*     */     //   69: pop
/*     */     //   70: goto -> 114
/*     */     //   73: astore #7
/*     */     //   75: aload #7
/*     */     //   77: instanceof com/intellij/openapi/diagnostic/ControlFlowException
/*     */     //   80: ifeq -> 86
/*     */     //   83: aload #7
/*     */     //   85: athrow
/*     */     //   86: getstatic com/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   89: aload_1
/*     */     //   90: aload_3
/*     */     //   91: aload_2
/*     */     //   92: aload #4
/*     */     //   94: aload #6
/*     */     //   96: invokeinterface size : ()I
/*     */     //   101: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;I)Ljava/lang/String;
/*     */     //   106: aload #7
/*     */     //   108: checkcast java/lang/Throwable
/*     */     //   111: invokevirtual error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   114: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #95	-> 0
/*     */     //   #96	-> 1
/*     */     //   #97	-> 2
/*     */     //   #98	-> 8
/*     */     //   #102	-> 44
/*     */     //   #106	-> 73
/*     */     //   #107	-> 75
/*     */     //   #109	-> 86
/*     */     //   #110	-> 89
/*     */     //   #111	-> 90
/*     */     //   #112	-> 94
/*     */     //   #109	-> 111
/*     */     //   #115	-> 114
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   75	39	7	e	Ljava/lang/Exception;
/*     */     //   0	115	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;
/*     */     //   0	115	1	query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*     */     //   0	115	2	gotoModel	Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;
/*     */     //   0	115	3	itemProvider	Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*     */     //   0	115	4	viewModel	Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;
/*     */     //   0	115	5	progressIndicator	Lcom/intellij/openapi/progress/ProgressIndicator;
/*     */     //   0	115	6	result	Ljava/util/List;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	70	73	java/lang/Exception
/*     */   }
/*     */   
/*     */   private static final boolean findClassOrPsiElement$lambda$6(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   private static final boolean findClassOrPsiElement$lambda$5(AbstractSymbolProjectSearcher this$0, List<FoundPsiItemWithWeight> $result, ContributorsBasedGotoByModel $gotoModel, SearchQuery $query, FoundItemDescriptor it) {
/*     */     return this$0.addClassOrPsiElement(it.getItem(), $result, $gotoModel, $query, it.getWeight());
/*     */   }
/*     */   
/*     */   private static final boolean findClassOrPsiElement$lambda$7(AbstractSymbolProjectSearcher this$0, List<FoundPsiItemWithWeight> $result, ContributorsBasedGotoByModel $gotoModel, SearchQuery $query, Object it) {
/*     */     return this$0.addClassOrPsiElement(it, $result, $gotoModel, $query, 1);
/*     */   }
/*     */   
/*     */   @RequiresReadLock
/*     */   private final boolean addClassOrPsiElement(Object item, List<FoundPsiItemWithWeight> result, ContributorsBasedGotoByModel gotoModel, SearchQuery query, int weight) {
/*     */     if (item instanceof PsiElement && !(item instanceof PsiFile) && ((PsiElement)item).getContainingFile() != null && ((PsiElement)item).getTextOffset() >= 0 && checkContainingFile(query.getFilter(), (PsiElement)((PsiElement)item).getContainingFile())) {
/*     */       PsiElement it = (PsiElement)item;
/*     */       int $i$a$-let-AbstractSymbolProjectSearcher$addClassOrPsiElement$name$1 = 0;
/*     */       if (gotoModel.getFullName(item) == null)
/*     */         gotoModel.getFullName(item); 
/*     */       String name = query.getQuery();
/*     */       result.add(getFoundPsiItemWithWeight((PsiElement)item, name, weight));
/*     */     } 
/*     */     return (result.size() < query.getQueryLimit());
/*     */   }
/*     */   
/*     */   @RequiresReadLock
/*     */   private final FoundPsiItemWithWeight getFoundPsiItemWithWeight(PsiElement item, String name, int weight) {
/*     */     Intrinsics.checkNotNullExpressionValue(item.getContainingFile().getFileDocument(), "getFileDocument(...)");
/*     */     Document document = item.getContainingFile().getFileDocument();
/*     */     int startLine = document.getLineNumber(item.getTextOffset());
/*     */     Intrinsics.checkNotNullExpressionValue(document.getText(DocumentUtil.getLineTextRange(document, startLine)), "getText(...)");
/*     */     String lineText = StringsKt.trim(document.getText(DocumentUtil.getLineTextRange(document, startLine))).toString();
/*     */     Intrinsics.checkNotNullExpressionValue(item.getContainingFile().getVirtualFile(), "getVirtualFile(...)");
/*     */     SearchResultContent searchResultContent1 = new SearchResultContent(startLine), searchResultContent2 = searchResultContent1;
/*     */     VirtualFile virtualFile1 = item.getContainingFile().getVirtualFile();
/*     */     int i = weight;
/*     */     String str1 = name;
/*     */     int $i$a$-also-AbstractSymbolProjectSearcher$getFoundPsiItemWithWeight$1 = 0;
/*     */     searchResultContent2.setLineText(lineText);
/*     */     searchResultContent2.setWeight(weight);
/*     */     Unit unit = Unit.INSTANCE;
/*     */     SmartPsiElementPointer<? extends PsiElement> smartPsiElementPointer = SmartPointersKt.createSmartPointer(item);
/*     */     SearchResultContent searchResultContent3 = searchResultContent1;
/*     */     VirtualFile virtualFile2 = virtualFile1;
/*     */     int j = i;
/*     */     String str2 = str1;
/*     */     return new FoundPsiItemWithWeight(str2, j, virtualFile2, searchResultContent3, smartPsiElementPointer);
/*     */   }
/*     */   
/*     */   private final boolean checkContainingFile(SearchResultsFilter $this$checkContainingFile, PsiElement psiElement) {
/*     */     PsiFile file = (psiElement != null) ? psiElement.getContainingFile() : null;
/*     */     return (file != null && checkFile($this$checkContainingFile, file));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public abstract ContributorsBasedGotoByModel getContributorsBasedGotoByModel(@NotNull Disposable paramDisposable);
/*     */   
/*     */   @NotNull
/*     */   public abstract List<String> getPrefixToReplace();
/*     */   
/*     */   @Nullable
/*     */   protected Object searchProject(@NotNull SearchQuery query, @NotNull Disposable disposable, @NotNull Continuation<? super List<SearchResultItem>> $completion) {
/*     */     return searchProject$suspendImpl(this, query, disposable, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractSymbolProjectSearcher.kt", l = {61}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"query", "result"}, m = "searchProject$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.services.search.AbstractSymbolProjectSearcher")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractSymbolProjectSearcher$searchProject$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     AbstractSymbolProjectSearcher$searchProject$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractSymbolProjectSearcher.searchProject$suspendImpl(AbstractSymbolProjectSearcher.this, (SearchQuery)null, (Disposable)null, (Continuation<? super List<SearchResultItem>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\AbstractSymbolProjectSearcher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */