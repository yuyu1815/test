/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\002\030\0002\024\022\004\022\0020\002\022\004\022\0020\003\022\004\022\0020\0040\001B\r\022\006\020\005\032\0020\006¢\006\002\020\007J\b\020\b\032\0020\002H\026J\025\020\t\032\0020\0042\006\020\n\032\0020\013H\026¢\006\002\020\fJ\020\020\n\032\0020\0032\006\020\n\032\0020\004H\026¨\006\r"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$Int;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "Lai/grazie/utils/attributes/Attributes$Value$Long;", "", "name", "", "(Ljava/lang/String;)V", "key", "unwrap", "value", "Lai/grazie/utils/attributes/Attributes$Value;", "(Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Integer;", "utils-common"})
/*    */ public final class Int
/*    */   extends AttributeDescriptor<Attributes.Key.Long, Attributes.Value.Long, Integer>
/*    */ {
/*    */   public Int(@NotNull String name) {
/* 24 */     super(name, false); } @NotNull
/* 25 */   public Attributes.Key.Long key() { return new Attributes.Key.Long(getName()); } @NotNull
/* 26 */   public Attributes.Value.Long value(int value) { return new Attributes.Value.Long(value, null, 2, null); } @NotNull
/*    */   public Integer unwrap(@NotNull Attributes.Value value) {
/* 28 */     Intrinsics.checkNotNullParameter(value, "value"); return Integer.valueOf((int)((Number)Attributes.Companion.<Number>unwrap(key(), value)).longValue());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributeDescriptor$Int.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */