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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\003\030\0002\026\022\004\022\0020\002\022\004\022\0020\003\022\006\022\004\030\0010\0040\001B\r\022\006\020\005\032\0020\006¢\006\002\020\007J\b\020\b\032\0020\002H\026J\025\020\t\032\0020\0042\006\020\n\032\0020\013H\026¢\006\002\020\fJ\031\020\n\032\004\030\0010\0032\b\020\n\032\004\030\0010\004H\026¢\006\002\020\r¨\006\016"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$OptBool;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "Lai/grazie/utils/attributes/Attributes$Value$Bool;", "", "name", "", "(Ljava/lang/String;)V", "key", "unwrap", "value", "Lai/grazie/utils/attributes/Attributes$Value;", "(Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lai/grazie/utils/attributes/Attributes$Value$Bool;", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nAttributeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeDescriptor.kt\nai/grazie/utils/attributes/AttributeDescriptor$OptBool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
/*    */ public final class OptBool
/*    */   extends AttributeDescriptor<Attributes.Key.Bool, Attributes.Value.Bool, Boolean>
/*    */ {
/*    */   public OptBool(@NotNull String name) {
/* 40 */     super(name, true); } @NotNull
/* 41 */   public Attributes.Key.Bool key() { return new Attributes.Key.Bool(getName()); } @Nullable
/* 42 */   public Attributes.Value.Bool value(@Nullable Boolean value) { boolean it = value.booleanValue();
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
/* 85 */     int $i$a$-let-AttributeDescriptor$OptBool$value$1 = 0;
/*    */     return (value != null) ? new Attributes.Value.Bool(value.booleanValue(), null, 2, null) : null; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public Boolean unwrap(@NotNull Attributes.Value value) {
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     return Attributes.Companion.<Boolean>unwrap(key(), value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributeDescriptor$OptBool.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */