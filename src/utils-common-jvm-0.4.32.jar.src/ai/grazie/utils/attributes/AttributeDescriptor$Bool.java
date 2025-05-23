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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\002\030\0002\024\022\004\022\0020\002\022\004\022\0020\003\022\004\022\0020\0040\001B\r\022\006\020\005\032\0020\006¢\006\002\020\007J\b\020\b\032\0020\002H\026J\025\020\t\032\0020\0042\006\020\n\032\0020\013H\026¢\006\002\020\fJ\020\020\n\032\0020\0032\006\020\n\032\0020\004H\026¨\006\r"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$Bool;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "Lai/grazie/utils/attributes/Attributes$Value$Bool;", "", "name", "", "(Ljava/lang/String;)V", "key", "unwrap", "value", "Lai/grazie/utils/attributes/Attributes$Value;", "(Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Boolean;", "utils-common"})
/*    */ public final class Bool
/*    */   extends AttributeDescriptor<Attributes.Key.Bool, Attributes.Value.Bool, Boolean>
/*    */ {
/*    */   public Bool(@NotNull String name) {
/* 48 */     super(name, false); } @NotNull
/* 49 */   public Attributes.Key.Bool key() { return new Attributes.Key.Bool(getName()); } @NotNull
/* 50 */   public Attributes.Value.Bool value(boolean value) { return new Attributes.Value.Bool(value, null, 2, null); } @NotNull
/*    */   public Boolean unwrap(@NotNull Attributes.Value value) {
/* 52 */     Intrinsics.checkNotNullParameter(value, "value"); return Attributes.Companion.<Boolean>unwrap(key(), value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributeDescriptor$Bool.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */