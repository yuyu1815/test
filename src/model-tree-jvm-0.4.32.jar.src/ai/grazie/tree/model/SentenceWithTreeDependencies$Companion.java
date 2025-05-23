/*    */ package ai.grazie.tree.model;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001J\024\020\t\032\0020\n2\f\020\013\032\b\022\004\022\0020\0040\f¨\006\r"}, d2 = {"Lai/grazie/tree/model/SentenceWithTreeDependencies$Companion;", "", "()V", "empty", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "sentence", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toConlluBatch", "Lai/grazie/tree/model/SentenceWithTreeDependencies$ConlluBatch;", "deps", "", "model-tree"})
/*    */ @SourceDebugExtension({"SMAP\nSentenceWithTreeDependencies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceWithTreeDependencies.kt\nai/grazie/tree/model/SentenceWithTreeDependencies$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1557#2:67\n1628#2,3:68\n*S KotlinDebug\n*F\n+ 1 SentenceWithTreeDependencies.kt\nai/grazie/tree/model/SentenceWithTreeDependencies$Companion\n*L\n40#1:67\n40#1:68,3\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<SentenceWithTreeDependencies> serializer() {
/* 33 */     return (KSerializer<SentenceWithTreeDependencies>)SentenceWithTreeDependencies.$serializer.INSTANCE; } @NotNull
/*    */   public final SentenceWithTreeDependencies empty(@NotNull String sentence) {
/* 35 */     Intrinsics.checkNotNullParameter(sentence, "sentence"); return new SentenceWithTreeDependencies(sentence, new SentenceWithTreeDependencies.Node[0]);
/*    */   }
/*    */   @NotNull
/*    */   public final SentenceWithTreeDependencies.ConlluBatch toConlluBatch(@NotNull List deps) {
/* 39 */     Intrinsics.checkNotNullParameter(deps, "deps");
/* 40 */     Iterable $this$map$iv = deps; int $i$f$map = 0;
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
/* 67 */     Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 68 */     for (Object item$iv$iv : iterable1) {
/* 69 */       SentenceWithTreeDependencies sentenceWithTreeDependencies = (SentenceWithTreeDependencies)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-SentenceWithTreeDependencies$Companion$toConlluBatch$1 = 0; collection.add(ArraysKt.joinToString$default((Object[])sentenceWithTreeDependencies.getTree(), "\n", null, null, 0, null, new SentenceWithTreeDependencies$Companion$toConlluBatch$1$1(sentenceWithTreeDependencies), 30, null));
/* 70 */     }  List<String> list = (List)destination$iv$iv;
/*    */     return new SentenceWithTreeDependencies.ConlluBatch(list);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "node", "Lai/grazie/tree/model/SentenceWithTreeDependencies$Node;", "invoke"})
/*    */   static final class SentenceWithTreeDependencies$Companion$toConlluBatch$1$1 extends Lambda implements Function1<SentenceWithTreeDependencies.Node, CharSequence> {
/*    */     public final CharSequence invoke(SentenceWithTreeDependencies.Node node) {
/*    */       Intrinsics.checkNotNullParameter(node, "node");
/*    */       return node.getId() + "\t" + node.getId() + "\t_\t_\t_\t_\t" + node.getRange().substring(this.$it.getText()) + "\t" + node.getHeadId() + "\t_\t_";
/*    */     }
/*    */     
/*    */     SentenceWithTreeDependencies$Companion$toConlluBatch$1$1(SentenceWithTreeDependencies $it) {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tree-jvm-0.4.32.jar!\ai\grazie\tree\model\SentenceWithTreeDependencies$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */