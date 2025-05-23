/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ 
/*    */ import com.intellij.ide.util.gotoByName.ChooseByNameItemProvider;
/*    */ import com.intellij.ide.util.gotoByName.ContributorsBasedGotoByModel;
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.openapi.progress.ProgressManager;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ @DebugMetadata(f = "AbstractSymbolProjectSearcher.kt", l = {62}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.services.search.AbstractSymbolProjectSearcher$searchProject$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class AbstractSymbolProjectSearcher$searchProject$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore_2
/*    */     //   4: aload_0
/*    */     //   5: getfield label : I
/*    */     //   8: tableswitch default -> 101, 0 -> 32, 1 -> 91
/*    */     //   32: aload_1
/*    */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   36: aload_0
/*    */     //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;
/*    */     //   40: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   43: aload_0
/*    */     //   44: getfield $result : Ljava/util/List;
/*    */     //   47: aload_0
/*    */     //   48: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;
/*    */     //   51: aload_0
/*    */     //   52: getfield $query : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */     //   55: aload_0
/*    */     //   56: getfield $gotoModel : Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;
/*    */     //   59: aload_0
/*    */     //   60: getfield $itemProvider : Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*    */     //   63: aload_0
/*    */     //   64: getfield $viewModel : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/BackgroundChooseByNameViewModel;
/*    */     //   67: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/BackgroundChooseByNameViewModel;)Lkotlin/jvm/functions/Function0;
/*    */     //   72: aload_0
/*    */     //   73: checkcast kotlin/coroutines/Continuation
/*    */     //   76: aload_0
/*    */     //   77: iconst_1
/*    */     //   78: putfield label : I
/*    */     //   81: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   84: dup
/*    */     //   85: aload_2
/*    */     //   86: if_acmpne -> 96
/*    */     //   89: aload_2
/*    */     //   90: areturn
/*    */     //   91: aload_1
/*    */     //   92: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   95: aload_1
/*    */     //   96: pop
/*    */     //   97: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   100: areturn
/*    */     //   101: new java/lang/IllegalStateException
/*    */     //   104: dup
/*    */     //   105: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   107: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   110: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #61	-> 3
/*    */     //   #62	-> 36
/*    */     //   #61	-> 89
/*    */     //   #69	-> 96
/*    */     //   #61	-> 101
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	111	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher$searchProject$2;
/*    */     //   36	65	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$1(List $result, AbstractSymbolProjectSearcher this$0, SearchQuery $query, ContributorsBasedGotoByModel $gotoModel, ChooseByNameItemProvider $itemProvider, BackgroundChooseByNameViewModel $viewModel) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: aload_2
/*    */     //   3: aload_3
/*    */     //   4: aload #4
/*    */     //   6: aload #5
/*    */     //   8: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/BackgroundChooseByNameViewModel;)Lkotlin/jvm/functions/Function0;
/*    */     //   13: invokestatic blockingContextToIndicator : (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*    */     //   16: pop
/*    */     //   17: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   20: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #63	-> 0
/*    */     //   #68	-> 17
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	21	0	$result	Ljava/util/List;
/*    */     //   0	21	1	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher;
/*    */     //   0	21	2	$query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */     //   0	21	3	$gotoModel	Lcom/intellij/ide/util/gotoByName/ContributorsBasedGotoByModel;
/*    */     //   0	21	4	$itemProvider	Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*    */     //   0	21	5	$viewModel	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/BackgroundChooseByNameViewModel;
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$1$lambda$0(List $result, AbstractSymbolProjectSearcher this$0, SearchQuery $query, ContributorsBasedGotoByModel $gotoModel, ChooseByNameItemProvider $itemProvider, BackgroundChooseByNameViewModel $viewModel) {
/* 64 */     ProgressIndicator progressIndicator = ProgressManager.getGlobalProgressIndicator();
/* 65 */     $result.clear();
/* 66 */     Intrinsics.checkNotNull(progressIndicator); AbstractSymbolProjectSearcher.access$findClassOrPsiElement(AbstractSymbolProjectSearcher.this, $query, $gotoModel, $itemProvider, $viewModel, progressIndicator, $result);
/* 67 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   AbstractSymbolProjectSearcher$searchProject$2(List<AbstractSymbolProjectSearcher.FoundPsiItemWithWeight> $result, SearchQuery $query, ContributorsBasedGotoByModel $gotoModel, ChooseByNameItemProvider $itemProvider, BackgroundChooseByNameViewModel $viewModel, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super AbstractSymbolProjectSearcher$searchProject$2> $completion) {
/*    */     return (Continuation<Unit>)new AbstractSymbolProjectSearcher$searchProject$2(this.$result, this.$query, this.$gotoModel, this.$itemProvider, this.$viewModel, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((AbstractSymbolProjectSearcher$searchProject$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\AbstractSymbolProjectSearcher$searchProject$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */