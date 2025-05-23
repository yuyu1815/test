/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\003\030\0002\026\022\004\022\0020\002\022\004\022\0020\003\022\006\022\004\030\0010\0040\001B\r\022\006\020\005\032\0020\006¢\006\002\020\007J\b\020\b\032\0020\002H\026J\025\020\t\032\0020\0042\006\020\n\032\0020\013H\026¢\006\002\020\fJ\031\020\n\032\004\030\0010\0032\b\020\n\032\004\030\0010\004H\026¢\006\002\020\r¨\006\016"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$OptInt;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "Lai/grazie/utils/attributes/Attributes$Value$Long;", "", "name", "", "(Ljava/lang/String;)V", "key", "unwrap", "value", "Lai/grazie/utils/attributes/Attributes$Value;", "(Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lai/grazie/utils/attributes/Attributes$Value$Long;", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nAttributeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeDescriptor.kt\nai/grazie/utils/attributes/AttributeDescriptor$OptInt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
/*    */ public final class OptInt
/*    */   extends AttributeDescriptor<Attributes.Key.Long, Attributes.Value.Long, Integer>
/*    */ {
/*    */   public OptInt(@NotNull String name) {
/* 32 */     super(name, true); } @NotNull
/* 33 */   public Attributes.Key.Long key() { return new Attributes.Key.Long(getName()); } @Nullable
/* 34 */   public Attributes.Value.Long value(@Nullable Integer value) { int it = value.intValue();
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
/* 85 */     int $i$a$-let-AttributeDescriptor$OptInt$value$1 = 0;
/*    */     return (value != null) ? new Attributes.Value.Long(value.intValue(), null, 2, null) : null; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public Integer unwrap(@NotNull Attributes.Value value) {
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     return Integer.valueOf((int)((Number)Attributes.Companion.<Number>unwrap(key(), value)).longValue());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributeDescriptor$OptInt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */