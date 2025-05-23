/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\000\n\002\020\017\n\000\n\002\020\b\n\002\b\003\bg\030\000*\006\b\000\020\001 \0002\b\022\004\022\002H\0010\002J\025\020\003\032\0020\0042\006\020\005\032\0028\000H\026¢\006\002\020\006ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lai/grazie/utils/mpp/MPPComparable;", "T", "", "compare", "", "other", "(Ljava/lang/Object;)I", "utils-common"})
/*    */ public interface MPPComparable<T>
/*    */   extends Comparable<T>
/*    */ {
/*    */   default int compare(Object other) {
/* 10 */     return compareTo((T)other);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\MPPComparable.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */