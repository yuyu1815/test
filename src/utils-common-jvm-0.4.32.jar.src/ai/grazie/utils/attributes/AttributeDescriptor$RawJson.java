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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\005\n\002\030\002\n\000\030\0002\024\022\004\022\0020\002\022\004\022\0020\003\022\004\022\0020\0040\001B\r\022\006\020\005\032\0020\004¢\006\002\020\006J\b\020\007\032\0020\002H\026J\020\020\b\032\0020\0042\006\020\t\032\0020\nH\026J\020\020\t\032\0020\0032\006\020\t\032\0020\004H\026¨\006\013"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$RawJson;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "Lai/grazie/utils/attributes/Attributes$Value$Json;", "", "name", "(Ljava/lang/String;)V", "key", "unwrap", "value", "Lai/grazie/utils/attributes/Attributes$Value;", "utils-common"})
/*    */ public final class RawJson
/*    */   extends AttributeDescriptor<Attributes.Key.Json, Attributes.Value.Json, String>
/*    */ {
/*    */   public RawJson(@NotNull String name) {
/* 56 */     super(name, false); } @NotNull
/* 57 */   public Attributes.Key.Json key() { return new Attributes.Key.Json(getName(), null, 2, null); } @NotNull
/* 58 */   public Attributes.Value.Json value(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); return new Attributes.Value.Json(value, null, 2, null); } @NotNull
/*    */   public String unwrap(@NotNull Attributes.Value value) {
/* 60 */     Intrinsics.checkNotNullParameter(value, "value"); return Attributes.Companion.<String>unwrap(key(), value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributeDescriptor$RawJson.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */