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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\005\n\002\030\002\n\000\030\0002\026\022\004\022\0020\002\022\004\022\0020\003\022\006\022\004\030\0010\0040\001B\r\022\006\020\005\032\0020\004¢\006\002\020\006J\b\020\007\032\0020\002H\026J\020\020\b\032\0020\0042\006\020\t\032\0020\nH\026J\024\020\t\032\004\030\0010\0032\b\020\t\032\004\030\0010\004H\026¨\006\013"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$OptRawJson;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "Lai/grazie/utils/attributes/Attributes$Value$Json;", "", "name", "(Ljava/lang/String;)V", "key", "unwrap", "value", "Lai/grazie/utils/attributes/Attributes$Value;", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nAttributeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeDescriptor.kt\nai/grazie/utils/attributes/AttributeDescriptor$OptRawJson\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
/*    */ public final class OptRawJson
/*    */   extends AttributeDescriptor<Attributes.Key.Json, Attributes.Value.Json, String>
/*    */ {
/*    */   public OptRawJson(@NotNull String name) {
/* 64 */     super(name, true); } @NotNull
/* 65 */   public Attributes.Key.Json key() { return new Attributes.Key.Json(getName(), null, 2, null); } @Nullable
/* 66 */   public Attributes.Value.Json value(@Nullable String value) { String it = value;
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
/* 85 */     int $i$a$-let-AttributeDescriptor$OptRawJson$value$1 = 0;
/*    */     return (value != null) ? new Attributes.Value.Json(value, null, 2, null) : null; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String unwrap(@NotNull Attributes.Value value) {
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     return Attributes.Companion.<String>unwrap(key(), value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributeDescriptor$OptRawJson.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */