/*    */ package ai.grazie.tree.suspendable;
/*    */ 
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\004\bf\030\000 \n2\0020\001:\001\nJ\026\020\002\032\0020\0032\006\020\004\032\0020\005H@¢\006\002\020\006J\"\020\002\032\b\022\004\022\0020\0030\0072\f\020\b\032\b\022\004\022\0020\0050\007H¦@¢\006\002\020\tø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Lai/grazie/tree/suspendable/SuspendableTreeDependencyService;", "", "parse", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "sentence", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sentences", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "model-tree"})
/*    */ public interface SuspendableTreeDependencyService {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @Nullable
/*    */   Object parse(@NotNull List<String> paramList, @NotNull Continuation<? super List<SentenceWithTreeDependencies>> paramContinuation);
/*    */   
/*    */   @Nullable
/*    */   default Object parse(@NotNull String sentence, @NotNull Continuation<? super SentenceWithTreeDependencies> $completion) {
/*    */     return parse$suspendImpl(this, sentence, $completion);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\007¨\006\t"}, d2 = {"Lai/grazie/tree/suspendable/SuspendableTreeDependencyService$Companion;", "", "()V", "of", "Lai/grazie/tree/suspendable/SuspendableTreeDependencyService;", "language", "Lai/grazie/nlp/langs/Language;", "multi", "Lai/grazie/tree/suspendable/SuspendableMultiTreeDependencyService;", "model-tree"})
/*    */   public static final class Companion { @JvmStatic
/*    */     @NotNull
/* 23 */     public final SuspendableTreeDependencyService of(@NotNull Language language, @NotNull SuspendableMultiTreeDependencyService multi) { Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(multi, "multi"); return new SuspendableTreeDependencyService$Companion$of$1(multi, language); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\002*\001\000\b\n\030\0002\0020\001J\"\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H@¢\006\002\020\007¨\006\b"}, d2 = {"ai/grazie/tree/suspendable/SuspendableTreeDependencyService$Companion$of$1", "Lai/grazie/tree/suspendable/SuspendableTreeDependencyService;", "parse", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "sentences", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-tree"})
/*    */     public static final class SuspendableTreeDependencyService$Companion$of$1 implements SuspendableTreeDependencyService {
/* 25 */       SuspendableTreeDependencyService$Companion$of$1(SuspendableMultiTreeDependencyService $multi, Language $language) {} public Object parse(List<String> sentences, Continuation<? super List<SentenceWithTreeDependencies>> $completion) { return this.$multi.parse(this.$language, sentences, $completion); } } } @JvmStatic
/*    */   @NotNull
/*    */   static SuspendableTreeDependencyService of(@NotNull Language language, @NotNull SuspendableMultiTreeDependencyService multi) {
/* 28 */     return Companion.of(language, multi);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SuspendableTreeDependencyService.kt", l = {17}, i = {}, s = {}, n = {}, m = "parse$suspendImpl", c = "ai.grazie.tree.suspendable.SuspendableTreeDependencyService")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SuspendableTreeDependencyService$parse$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     SuspendableTreeDependencyService$parse$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SuspendableTreeDependencyService.parse$suspendImpl(SuspendableTreeDependencyService.this, null, (Continuation<? super SentenceWithTreeDependencies>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tree-jvm-0.4.32.jar!\ai\grazie\tree\suspendable\SuspendableTreeDependencyService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */