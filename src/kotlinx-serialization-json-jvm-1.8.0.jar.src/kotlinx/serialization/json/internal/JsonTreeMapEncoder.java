/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonObject;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\003\n\002\020\016\n\000\n\002\020\013\n\002\b\005\b\002\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\004\b\b\020\tJ\030\020\016\032\0020\0072\006\020\017\032\0020\0132\006\020\020\032\0020\006H\026J\b\020\021\032\0020\006H\026R\016\020\n\032\0020\013X.¢\006\002\n\000R\016\020\f\032\0020\rX\016¢\006\002\n\000¨\006\022"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeMapEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "json", "Lkotlinx/serialization/json/Json;", "nodeConsumer", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "tag", "", "isKey", "", "putElement", "key", "element", "getCurrent", "kotlinx-serialization-json"})
/*     */ final class JsonTreeMapEncoder
/*     */   extends JsonTreeEncoder
/*     */ {
/*     */   private String tag;
/*     */   private boolean isKey;
/*     */   
/*     */   public JsonTreeMapEncoder(@NotNull Json json, @NotNull Function1<? super JsonElement, Unit> nodeConsumer) {
/* 233 */     super(json, nodeConsumer);
/*     */     
/* 235 */     this.isKey = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void putElement(@NotNull String key, @NotNull JsonElement element) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'key'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'element'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: getfield isKey : Z
/*     */     //   16: ifeq -> 92
/*     */     //   19: aload_0
/*     */     //   20: aload_2
/*     */     //   21: astore_3
/*     */     //   22: aload_3
/*     */     //   23: instanceof kotlinx/serialization/json/JsonPrimitive
/*     */     //   26: ifeq -> 39
/*     */     //   29: aload_2
/*     */     //   30: checkcast kotlinx/serialization/json/JsonPrimitive
/*     */     //   33: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   36: goto -> 81
/*     */     //   39: aload_3
/*     */     //   40: instanceof kotlinx/serialization/json/JsonObject
/*     */     //   43: ifeq -> 56
/*     */     //   46: getstatic kotlinx/serialization/json/JsonObjectSerializer.INSTANCE : Lkotlinx/serialization/json/JsonObjectSerializer;
/*     */     //   49: invokevirtual getDescriptor : ()Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   52: invokestatic InvalidKeyKindException : (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/internal/JsonEncodingException;
/*     */     //   55: athrow
/*     */     //   56: aload_3
/*     */     //   57: instanceof kotlinx/serialization/json/JsonArray
/*     */     //   60: ifeq -> 73
/*     */     //   63: getstatic kotlinx/serialization/json/JsonArraySerializer.INSTANCE : Lkotlinx/serialization/json/JsonArraySerializer;
/*     */     //   66: invokevirtual getDescriptor : ()Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   69: invokestatic InvalidKeyKindException : (Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/internal/JsonEncodingException;
/*     */     //   72: athrow
/*     */     //   73: new kotlin/NoWhenBranchMatchedException
/*     */     //   76: dup
/*     */     //   77: invokespecial <init> : ()V
/*     */     //   80: athrow
/*     */     //   81: putfield tag : Ljava/lang/String;
/*     */     //   84: aload_0
/*     */     //   85: iconst_0
/*     */     //   86: putfield isKey : Z
/*     */     //   89: goto -> 126
/*     */     //   92: aload_0
/*     */     //   93: invokevirtual getContent : ()Ljava/util/Map;
/*     */     //   96: astore_3
/*     */     //   97: aload_0
/*     */     //   98: getfield tag : Ljava/lang/String;
/*     */     //   101: dup
/*     */     //   102: ifnonnull -> 112
/*     */     //   105: pop
/*     */     //   106: ldc 'tag'
/*     */     //   108: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*     */     //   111: aconst_null
/*     */     //   112: aload_3
/*     */     //   113: swap
/*     */     //   114: aload_2
/*     */     //   115: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   120: pop
/*     */     //   121: aload_0
/*     */     //   122: iconst_1
/*     */     //   123: putfield isKey : Z
/*     */     //   126: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #238	-> 12
/*     */     //   #239	-> 19
/*     */     //   #240	-> 22
/*     */     //   #241	-> 39
/*     */     //   #242	-> 56
/*     */     //   #239	-> 73
/*     */     //   #244	-> 84
/*     */     //   #246	-> 92
/*     */     //   #247	-> 121
/*     */     //   #249	-> 126
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	127	0	this	Lkotlinx/serialization/json/internal/JsonTreeMapEncoder;
/*     */     //   0	127	1	key	Ljava/lang/String;
/*     */     //   0	127	2	element	Lkotlinx/serialization/json/JsonElement;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public JsonElement getCurrent() {
/* 252 */     return (JsonElement)new JsonObject(getContent());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonTreeMapEncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */