/*    */ package ai.grazie.code.indexing.model;
/*    */ 
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\"\n\002\030\002\n\002\030\002\n\000\032\020\020\000\032\b\022\004\022\0020\0020\001*\0020\003¨\006\004"}, d2 = {"getIndexTypes", "", "Lai/grazie/code/indexing/model/IndexItemType;", "Lai/grazie/code/indexing/model/IndexScope;", "model-indexing"})
/*    */ public final class IndexItemTypeKt
/*    */ {
/*    */   @NotNull
/*    */   public static final Set<IndexItemType> getIndexTypes(@NotNull IndexScope $this$getIndexTypes) {
/*    */     IndexItemType[] arrayOfIndexItemType;
/* 18 */     Intrinsics.checkNotNullParameter($this$getIndexTypes, "<this>"); switch (WhenMappings.$EnumSwitchMapping$0[$this$getIndexTypes.ordinal()]) { case 1: 
/*    */       case 2:
/* 20 */         arrayOfIndexItemType = new IndexItemType[3]; arrayOfIndexItemType[0] = IndexItemType.CLASSES; arrayOfIndexItemType[1] = IndexItemType.METHODS; arrayOfIndexItemType[2] = IndexItemType.PROPERTIES;
/*    */       case 3: 
/* 22 */       case 4: case 5: case 6:  }  throw new NoWhenBranchMatchedException();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\IndexItemTypeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */