/*    */ package ai.grazie.code.indexing.model.search;
/*    */ 
/*    */ import ai.grazie.code.indexing.model.snapshot.JSSnapshotMetadata;
/*    */ import ai.grazie.code.indexing.model.snapshot.SnapshotMetadata;
/*    */ import ai.grazie.code.indexing.model.snapshot.SnapshotMetadataKt;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002¨\006\003"}, d2 = {"toJS", "Lai/grazie/code/indexing/model/search/JSIndexedRepo;", "Lai/grazie/code/indexing/model/search/IndexedRepository;", "model-indexing"})
/*    */ @SourceDebugExtension({"SMAP\nIndexedRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexedRepository.kt\nai/grazie/code/indexing/model/search/IndexedRepositoryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,39:1\n1557#2:40\n1628#2,3:41\n37#3:44\n36#3,3:45\n*S KotlinDebug\n*F\n+ 1 IndexedRepository.kt\nai/grazie/code/indexing/model/search/IndexedRepositoryKt\n*L\n38#1:40\n38#1:41,3\n38#1:44\n38#1:45,3\n*E\n"})
/*    */ public final class IndexedRepositoryKt
/*    */ {
/*    */   @NotNull
/*    */   public static final JSIndexedRepo toJS(@NotNull IndexedRepository $this$toJS) {
/* 38 */     Intrinsics.checkNotNullParameter($this$toJS, "<this>"); List<SnapshotMetadata> list1 = $this$toJS.getSnapshots(); String str1 = $this$toJS.getRepository(); int $i$f$map = 0;
/*    */     
/* 40 */     List<SnapshotMetadata> list2 = list1; Collection<JSSnapshotMetadata> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 41 */     for (SnapshotMetadata item$iv$iv : list2) {
/* 42 */       SnapshotMetadata snapshotMetadata1 = item$iv$iv; Collection<JSSnapshotMetadata> collection = destination$iv$iv; int $i$a$-map-IndexedRepositoryKt$toJS$1 = 0; collection.add(SnapshotMetadataKt.toJS(snapshotMetadata1));
/* 43 */     }  Iterable $this$map$iv = destination$iv$iv;
/*    */     int $i$f$toTypedArray = 0;
/* 45 */     Iterable iterable1 = $this$map$iv;
/*    */     
/* 47 */     JSSnapshotMetadata[] arrayOfJSSnapshotMetadata = (JSSnapshotMetadata[])iterable1.toArray((Object[])new JSSnapshotMetadata[0]);
/*    */     String str2 = str1;
/*    */     return new JSIndexedRepo(str2, arrayOfJSSnapshotMetadata);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\search\IndexedRepositoryKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */