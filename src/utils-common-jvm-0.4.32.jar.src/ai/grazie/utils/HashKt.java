/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\020\016\n\002\020\034\n\002\b\002\032\n\020\000\032\0020\001*\0020\002\032\020\020\000\032\0020\001*\b\022\004\022\0020\0010\003\032\020\020\004\032\0020\001*\b\022\004\022\0020\0010\003¨\006\005"}, d2 = {"hash", "Lai/grazie/utils/Hash;", "", "", "hashForSet", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nHash.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hash.kt\nai/grazie/utils/HashKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1053#2:32\n*S KotlinDebug\n*F\n+ 1 Hash.kt\nai/grazie/utils/HashKt\n*L\n30#1:32\n*E\n"})
/*    */ public final class HashKt
/*    */ {
/*    */   @NotNull
/*    */   public static final Hash hash(@NotNull String $this$hash) {
/* 28 */     Intrinsics.checkNotNullParameter($this$hash, "<this>"); return new Hash($this$hash.hashCode()); } @NotNull
/* 29 */   public static final Hash hash(@NotNull Iterable $this$hash) { Intrinsics.checkNotNullParameter($this$hash, "<this>"); return new Hash(CollectionsKt.toList($this$hash).hashCode()); } @NotNull
/* 30 */   public static final Hash hashForSet(@NotNull Iterable $this$hashForSet) { Intrinsics.checkNotNullParameter($this$hashForSet, "<this>"); Iterable $this$sortedBy$iv = CollectionsKt.distinct($this$hashForSet); int $i$f$sortedBy = 0; return new Hash(CollectionsKt.toList(
/*    */           
/* 32 */           CollectionsKt.sortedWith($this$sortedBy$iv, new HashKt$hashForSet$$inlined$sortedBy$1())).hashCode()); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\HashKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */