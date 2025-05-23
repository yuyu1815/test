/*     */ package kotlinx.serialization.json.internal;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.descriptors.SerialKind;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\0321\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\0042\006\020\005\032\002H\0022\f\020\006\032\b\022\004\022\002H\0020\007H\007¢\006\002\020\b\032;\020\020\032\002H\002\"\n\b\000\020\002\030\001*\0020\0012\006\020\005\032\0020\0012\006\020\021\032\0020\0172\f\020\022\032\b\022\004\022\0020\0170\023H\bø\001\000¢\006\002\020\024\"\030\020\t\032\0020\n*\0020\0138BX\004¢\006\006\032\004\b\f\020\r\"\016\020\016\032\0020\017XT¢\006\002\n\000\002\007\n\005\b20\001¨\006\025"}, d2 = {"writeJson", "Lkotlinx/serialization/json/JsonElement;", "T", "json", "Lkotlinx/serialization/json/Json;", "value", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Lkotlinx/serialization/SerializationStrategy;)Lkotlinx/serialization/json/JsonElement;", "requiresTopLevelTag", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getRequiresTopLevelTag", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "PRIMITIVE_TAG", "", "cast", "serialName", "path", "Lkotlin/Function0;", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"})
/*     */ public final class TreeJsonEncoderKt {
/*     */   @JsonFriendModuleApi
/*     */   @NotNull
/*     */   public static final <T> JsonElement writeJson(@NotNull Json json, Object value, @NotNull SerializationStrategy<? super Object> serializer) {
/*  19 */     Intrinsics.checkNotNullParameter(json, "json"); Intrinsics.checkNotNullParameter(serializer, "serializer"); Ref.ObjectRef result = new Ref.ObjectRef();
/*  20 */     JsonTreeEncoder encoder = new JsonTreeEncoder(json, result::writeJson$lambda$0);
/*  21 */     encoder.encodeSerializableValue(serializer, value);
/*  22 */     Intrinsics.throwUninitializedPropertyAccessException("result"); return (result.element == null) ? null : (JsonElement)result.element;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String PRIMITIVE_TAG = "primitive";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit writeJson$lambda$0(Ref.ObjectRef $result, JsonElement it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     $result.element = it;
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final boolean getRequiresTopLevelTag(SerialDescriptor $this$requiresTopLevelTag) {
/* 184 */     return ($this$requiresTopLevelTag.getKind() instanceof kotlinx.serialization.descriptors.PrimitiveKind || $this$requiresTopLevelTag.getKind() == SerialKind.ENUM.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\TreeJsonEncoderKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */