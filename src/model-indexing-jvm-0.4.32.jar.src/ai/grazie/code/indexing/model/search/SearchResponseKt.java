/*    */ package ai.grazie.code.indexing.model.search;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002¨\006\003"}, d2 = {"toJS", "Lai/grazie/code/indexing/model/search/JSSearchResponse;", "Lai/grazie/code/indexing/model/search/SearchResponse;", "model-indexing"})
/*    */ @SourceDebugExtension({"SMAP\nSearchResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResponse.kt\nai/grazie/code/indexing/model/search/SearchResponseKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,45:1\n37#2:46\n36#2,3:47\n*S KotlinDebug\n*F\n+ 1 SearchResponse.kt\nai/grazie/code/indexing/model/search/SearchResponseKt\n*L\n44#1:46\n44#1:47,3\n*E\n"})
/*    */ public final class SearchResponseKt
/*    */ {
/*    */   @NotNull
/*    */   public static final JSSearchResponse toJS(@NotNull SearchResponse $this$toJS) {
/* 44 */     Intrinsics.checkNotNullParameter($this$toJS, "<this>"); Collection<SearchResultWithType> $this$toTypedArray$iv = $this$toJS.getRes(); int $i$f$toTypedArray = 0;
/*    */ 
/*    */     
/* 47 */     Collection<SearchResultWithType> thisCollection$iv = $this$toTypedArray$iv;
/*    */     
/* 49 */     return new JSSearchResponse(thisCollection$iv.<SearchResultWithType>toArray(new SearchResultWithType[0]), $this$toJS.getIndexDescriptor(), $this$toJS.getRevision());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\search\SearchResponseKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */