/*    */ package ai.grazie.tree.suspendable;
/*    */ 
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import ai.grazie.tree.model.SentenceWithTreeDependencies;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\007¨\006\t"}, d2 = {"Lai/grazie/tree/suspendable/SuspendableTreeDependencyService$Companion;", "", "()V", "of", "Lai/grazie/tree/suspendable/SuspendableTreeDependencyService;", "language", "Lai/grazie/nlp/langs/Language;", "multi", "Lai/grazie/tree/suspendable/SuspendableMultiTreeDependencyService;", "model-tree"})
/*    */ public final class Companion
/*    */ {
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public final SuspendableTreeDependencyService of(@NotNull Language language, @NotNull SuspendableMultiTreeDependencyService multi) {
/* 23 */     Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(multi, "multi"); return new SuspendableTreeDependencyService$Companion$of$1(multi, language); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\002*\001\000\b\n\030\0002\0020\001J\"\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H@¢\006\002\020\007¨\006\b"}, d2 = {"ai/grazie/tree/suspendable/SuspendableTreeDependencyService$Companion$of$1", "Lai/grazie/tree/suspendable/SuspendableTreeDependencyService;", "parse", "", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "sentences", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-tree"})
/*    */   public static final class SuspendableTreeDependencyService$Companion$of$1 implements SuspendableTreeDependencyService { public Object parse(List<String> sentences, Continuation<? super List<SentenceWithTreeDependencies>> $completion) {
/* 25 */       return this.$multi.parse(this.$language, sentences, $completion);
/*    */     }
/*    */     
/*    */     SuspendableTreeDependencyService$Companion$of$1(SuspendableMultiTreeDependencyService $multi, Language $language) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tree-jvm-0.4.32.jar!\ai\grazie\tree\suspendable\SuspendableTreeDependencyService$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */