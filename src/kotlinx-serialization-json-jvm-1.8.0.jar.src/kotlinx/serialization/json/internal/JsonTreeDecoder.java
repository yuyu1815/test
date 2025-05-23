/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.collections.SetsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.internal.JsonInternalDependenciesKt;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonNamingStrategy;
/*     */ import kotlinx.serialization.json.JsonObject;
/*     */ import kotlinx.serialization.json.JsonSchemaCacheKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\005\n\002\020\b\n\000\n\002\020\013\n\002\b\t\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\b\022\030\0002\0020\001B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\t¢\006\004\b\n\020\013J \020\022\032\0020\0212\006\020\023\032\0020\t2\006\020\024\032\0020\0172\006\020\025\032\0020\007H\002J\020\020\026\032\0020\0172\006\020\023\032\0020\tH\026J\030\020\027\032\0020\0212\006\020\023\032\0020\t2\006\020\024\032\0020\017H\002J\b\020\030\032\0020\021H\026J\030\020\031\032\0020\0072\006\020\023\032\0020\t2\006\020\024\032\0020\017H\024J\020\020\032\032\0020\0332\006\020\025\032\0020\007H\024J\020\020\034\032\0020\0352\006\020\023\032\0020\tH\026J\020\020\036\032\0020\0372\006\020\023\032\0020\tH\026R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\f\020\rR\020\020\b\032\004\030\0010\tX\004¢\006\002\n\000R\016\020\016\032\0020\017X\016¢\006\002\n\000R\016\020\020\032\0020\021X\016¢\006\002\n\000¨\006 "}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "json", "Lkotlinx/serialization/json/Json;", "value", "Lkotlinx/serialization/json/JsonObject;", "polymorphicDiscriminator", "", "polyDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getValue", "()Lkotlinx/serialization/json/JsonObject;", "position", "", "forceNull", "", "coerceInputValue", "descriptor", "index", "tag", "decodeElementIndex", "absenceIsNull", "decodeNotNullMark", "elementName", "currentElement", "Lkotlinx/serialization/json/JsonElement;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "endStructure", "", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n+ 2 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 3 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt$tryCoerceValue$1\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 6 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,342:1\n125#2,22:343\n147#2,4:366\n131#3:365\n1#4:370\n73#5:371\n270#6,8:372\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n*L\n204#1:343,22\n204#1:366,4\n204#1:365\n265#1:371\n265#1:372,8\n*E\n"})
/*     */ class JsonTreeDecoder
/*     */   extends AbstractJsonTreeDecoder
/*     */ {
/*     */   @NotNull
/*     */   private final JsonObject value;
/*     */   @Nullable
/*     */   private final SerialDescriptor polyDescriptor;
/*     */   private int position;
/*     */   private boolean forceNull;
/*     */   
/*     */   @NotNull
/*     */   public JsonObject getValue() {
/* 194 */     return this.value;
/*     */   }
/*     */   public JsonTreeDecoder(@NotNull Json json, @NotNull JsonObject value, @Nullable String polymorphicDiscriminator, @Nullable SerialDescriptor polyDescriptor) {
/* 197 */     super(json, (JsonElement)value, polymorphicDiscriminator, (DefaultConstructorMarker)null);
/*     */     this.value = value;
/*     */     this.polyDescriptor = polyDescriptor;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final boolean coerceInputValue(SerialDescriptor descriptor, int index, String tag) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual getJson : ()Lkotlinx/serialization/json/Json;
/*     */     //   4: astore #4
/*     */     //   6: iconst_0
/*     */     //   7: istore #5
/*     */     //   9: aload_1
/*     */     //   10: iload_2
/*     */     //   11: invokeinterface isElementOptional : (I)Z
/*     */     //   16: istore #6
/*     */     //   18: aload_1
/*     */     //   19: iload_2
/*     */     //   20: invokeinterface getElementDescriptor : (I)Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   25: astore #7
/*     */     //   27: iload #6
/*     */     //   29: ifeq -> 63
/*     */     //   32: aload #7
/*     */     //   34: invokeinterface isNullable : ()Z
/*     */     //   39: ifne -> 63
/*     */     //   42: iconst_1
/*     */     //   43: istore #8
/*     */     //   45: iconst_0
/*     */     //   46: istore #9
/*     */     //   48: aload_0
/*     */     //   49: aload_3
/*     */     //   50: invokevirtual currentElement : (Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
/*     */     //   53: instanceof kotlinx/serialization/json/JsonNull
/*     */     //   56: ifeq -> 63
/*     */     //   59: iconst_1
/*     */     //   60: goto -> 226
/*     */     //   63: aload #7
/*     */     //   65: invokeinterface getKind : ()Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   70: getstatic kotlinx/serialization/descriptors/SerialKind$ENUM.INSTANCE : Lkotlinx/serialization/descriptors/SerialKind$ENUM;
/*     */     //   73: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   76: ifeq -> 225
/*     */     //   79: aload #7
/*     */     //   81: invokeinterface isNullable : ()Z
/*     */     //   86: ifeq -> 110
/*     */     //   89: iconst_0
/*     */     //   90: istore #8
/*     */     //   92: iconst_0
/*     */     //   93: istore #9
/*     */     //   95: aload_0
/*     */     //   96: aload_3
/*     */     //   97: invokevirtual currentElement : (Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
/*     */     //   100: instanceof kotlinx/serialization/json/JsonNull
/*     */     //   103: ifeq -> 110
/*     */     //   106: iconst_0
/*     */     //   107: goto -> 226
/*     */     //   110: iconst_0
/*     */     //   111: istore #8
/*     */     //   113: aload_0
/*     */     //   114: aload_3
/*     */     //   115: invokevirtual currentElement : (Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
/*     */     //   118: astore #9
/*     */     //   120: aload #9
/*     */     //   122: instanceof kotlinx/serialization/json/JsonPrimitive
/*     */     //   125: ifeq -> 136
/*     */     //   128: aload #9
/*     */     //   130: checkcast kotlinx/serialization/json/JsonPrimitive
/*     */     //   133: goto -> 137
/*     */     //   136: aconst_null
/*     */     //   137: dup
/*     */     //   138: ifnull -> 147
/*     */     //   141: invokestatic getContentOrNull : (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;
/*     */     //   144: goto -> 149
/*     */     //   147: pop
/*     */     //   148: aconst_null
/*     */     //   149: dup
/*     */     //   150: ifnonnull -> 158
/*     */     //   153: pop
/*     */     //   154: iconst_0
/*     */     //   155: goto -> 226
/*     */     //   158: astore #10
/*     */     //   160: aload #7
/*     */     //   162: aload #4
/*     */     //   164: aload #10
/*     */     //   166: invokestatic getJsonNameIndex : (Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Ljava/lang/String;)I
/*     */     //   169: istore #11
/*     */     //   171: aload #4
/*     */     //   173: invokevirtual getConfiguration : ()Lkotlinx/serialization/json/JsonConfiguration;
/*     */     //   176: invokevirtual getExplicitNulls : ()Z
/*     */     //   179: ifne -> 196
/*     */     //   182: aload #7
/*     */     //   184: invokeinterface isNullable : ()Z
/*     */     //   189: ifeq -> 196
/*     */     //   192: iconst_1
/*     */     //   193: goto -> 197
/*     */     //   196: iconst_0
/*     */     //   197: istore #8
/*     */     //   199: iload #11
/*     */     //   201: bipush #-3
/*     */     //   203: if_icmpne -> 225
/*     */     //   206: iload #6
/*     */     //   208: ifne -> 216
/*     */     //   211: iload #8
/*     */     //   213: ifeq -> 225
/*     */     //   216: iconst_0
/*     */     //   217: istore #9
/*     */     //   219: nop
/*     */     //   220: nop
/*     */     //   221: iconst_1
/*     */     //   222: goto -> 226
/*     */     //   225: iconst_0
/*     */     //   226: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #204	-> 0
/*     */     //   #343	-> 6
/*     */     //   #349	-> 6
/*     */     //   #343	-> 6
/*     */     //   #351	-> 9
/*     */     //   #352	-> 18
/*     */     //   #353	-> 27
/*     */     //   #206	-> 48
/*     */     //   #353	-> 56
/*     */     //   #354	-> 63
/*     */     //   #355	-> 79
/*     */     //   #206	-> 95
/*     */     //   #355	-> 103
/*     */     //   #356	-> 106
/*     */     //   #359	-> 110
/*     */     //   #207	-> 113
/*     */     //   #359	-> 149
/*     */     //   #360	-> 154
/*     */     //   #359	-> 158
/*     */     //   #361	-> 160
/*     */     //   #362	-> 171
/*     */     //   #363	-> 199
/*     */     //   #364	-> 216
/*     */     //   #365	-> 219
/*     */     //   #364	-> 220
/*     */     //   #366	-> 221
/*     */     //   #369	-> 225
/*     */     //   #208	-> 226
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   48	8	9	$i$a$-tryCoerceValue$default-JsonTreeDecoder$coerceInputValue$1	I
/*     */     //   45	11	8	it	Z
/*     */     //   95	8	9	$i$a$-tryCoerceValue$default-JsonTreeDecoder$coerceInputValue$1	I
/*     */     //   92	11	8	it	Z
/*     */     //   113	36	8	$i$a$-tryCoerceValue$default-JsonTreeDecoder$coerceInputValue$2	I
/*     */     //   219	1	9	$i$a$-tryCoerceValue-JsonNamesMapKt$tryCoerceValue$1	I
/*     */     //   160	65	10	enumValue$iv	Ljava/lang/String;
/*     */     //   171	54	11	enumIndex$iv	I
/*     */     //   199	26	8	coerceToNull$iv	Z
/*     */     //   9	217	5	$i$f$tryCoerceValue	I
/*     */     //   18	208	6	isOptional$iv	Z
/*     */     //   27	199	7	elementDescriptor$iv	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   6	220	4	$this$tryCoerceValue_u24default$iv	Lkotlinx/serialization/json/Json;
/*     */     //   0	227	0	this	Lkotlinx/serialization/json/internal/JsonTreeDecoder;
/*     */     //   0	227	1	descriptor	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   0	227	2	index	I
/*     */     //   0	227	3	tag	Ljava/lang/String;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
/* 211 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); while (this.position < descriptor.getElementsCount()) {
/* 212 */       int i = this.position; this.position = i + 1; String name = getTag(descriptor, i);
/* 213 */       int index = this.position - 1;
/* 214 */       this.forceNull = false;
/* 215 */       if ((((Map)getValue()).containsKey(name) || absenceIsNull(descriptor, index)) && (
/* 216 */         !this.configuration.getCoerceInputValues() || !coerceInputValue(descriptor, index, name)))
/*     */       {
/* 218 */         return index;
/*     */       }
/*     */     } 
/* 221 */     return -1;
/*     */   }
/*     */   
/*     */   private final boolean absenceIsNull(SerialDescriptor descriptor, int index) {
/* 225 */     this.forceNull = (!getJson().getConfiguration().getExplicitNulls() && 
/* 226 */       !descriptor.isElementOptional(index) && descriptor.getElementDescriptor(index).isNullable());
/* 227 */     return this.forceNull;
/*     */   }
/*     */   
/*     */   public boolean decodeNotNullMark() {
/* 231 */     return (!this.forceNull && super.decodeNotNullMark());
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
/*     */   @NotNull
/*     */   protected String elementName(@NotNull SerialDescriptor descriptor, int index) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'descriptor'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: aload_0
/*     */     //   8: invokevirtual getJson : ()Lkotlinx/serialization/json/Json;
/*     */     //   11: invokestatic namingStrategy : (Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Lkotlinx/serialization/json/JsonNamingStrategy;
/*     */     //   14: astore_3
/*     */     //   15: aload_1
/*     */     //   16: iload_2
/*     */     //   17: invokeinterface getElementName : (I)Ljava/lang/String;
/*     */     //   22: astore #4
/*     */     //   24: aload_3
/*     */     //   25: ifnonnull -> 61
/*     */     //   28: aload_0
/*     */     //   29: getfield configuration : Lkotlinx/serialization/json/JsonConfiguration;
/*     */     //   32: invokevirtual getUseAlternativeNames : ()Z
/*     */     //   35: ifne -> 41
/*     */     //   38: aload #4
/*     */     //   40: areturn
/*     */     //   41: aload_0
/*     */     //   42: invokevirtual getValue : ()Lkotlinx/serialization/json/JsonObject;
/*     */     //   45: invokevirtual keySet : ()Ljava/util/Set;
/*     */     //   48: aload #4
/*     */     //   50: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   55: ifeq -> 61
/*     */     //   58: aload #4
/*     */     //   60: areturn
/*     */     //   61: aload_0
/*     */     //   62: invokevirtual getJson : ()Lkotlinx/serialization/json/Json;
/*     */     //   65: aload_1
/*     */     //   66: invokestatic deserializationNamesMap : (Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;
/*     */     //   69: astore #5
/*     */     //   71: aload_0
/*     */     //   72: invokevirtual getValue : ()Lkotlinx/serialization/json/JsonObject;
/*     */     //   75: invokevirtual keySet : ()Ljava/util/Set;
/*     */     //   78: checkcast java/lang/Iterable
/*     */     //   81: astore #7
/*     */     //   83: aload #7
/*     */     //   85: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   90: astore #8
/*     */     //   92: aload #8
/*     */     //   94: invokeinterface hasNext : ()Z
/*     */     //   99: ifeq -> 165
/*     */     //   102: aload #8
/*     */     //   104: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   109: astore #9
/*     */     //   111: aload #9
/*     */     //   113: checkcast java/lang/String
/*     */     //   116: astore #10
/*     */     //   118: iconst_0
/*     */     //   119: istore #11
/*     */     //   121: aload #5
/*     */     //   123: aload #10
/*     */     //   125: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   130: checkcast java/lang/Integer
/*     */     //   133: iload_2
/*     */     //   134: istore #12
/*     */     //   136: dup
/*     */     //   137: ifnonnull -> 144
/*     */     //   140: pop
/*     */     //   141: goto -> 156
/*     */     //   144: invokevirtual intValue : ()I
/*     */     //   147: iload #12
/*     */     //   149: if_icmpne -> 156
/*     */     //   152: iconst_1
/*     */     //   153: goto -> 157
/*     */     //   156: iconst_0
/*     */     //   157: ifeq -> 92
/*     */     //   160: aload #9
/*     */     //   162: goto -> 166
/*     */     //   165: aconst_null
/*     */     //   166: checkcast java/lang/String
/*     */     //   169: astore #6
/*     */     //   171: aload #6
/*     */     //   173: ifnull -> 186
/*     */     //   176: aload #6
/*     */     //   178: astore #7
/*     */     //   180: iconst_0
/*     */     //   181: istore #8
/*     */     //   183: aload #7
/*     */     //   185: areturn
/*     */     //   186: aload_3
/*     */     //   187: dup
/*     */     //   188: ifnull -> 203
/*     */     //   191: aload_1
/*     */     //   192: iload_2
/*     */     //   193: aload #4
/*     */     //   195: invokeinterface serialNameForJson : (Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)Ljava/lang/String;
/*     */     //   200: goto -> 205
/*     */     //   203: pop
/*     */     //   204: aconst_null
/*     */     //   205: astore #6
/*     */     //   207: aload #6
/*     */     //   209: dup
/*     */     //   210: ifnonnull -> 216
/*     */     //   213: pop
/*     */     //   214: aload #4
/*     */     //   216: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #235	-> 6
/*     */     //   #236	-> 15
/*     */     //   #237	-> 24
/*     */     //   #238	-> 28
/*     */     //   #242	-> 41
/*     */     //   #245	-> 61
/*     */     //   #246	-> 71
/*     */     //   #370	-> 118
/*     */     //   #246	-> 121
/*     */     //   #246	-> 157
/*     */     //   #246	-> 166
/*     */     //   #247	-> 183
/*     */     //   #250	-> 186
/*     */     //   #251	-> 191
/*     */     //   #252	-> 192
/*     */     //   #253	-> 193
/*     */     //   #250	-> 195
/*     */     //   #255	-> 207
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   121	36	11	$i$a$-find-JsonTreeDecoder$elementName$1	I
/*     */     //   118	39	10	it	Ljava/lang/String;
/*     */     //   183	3	8	$i$a$-let-JsonTreeDecoder$elementName$2	I
/*     */     //   180	6	7	it	Ljava/lang/String;
/*     */     //   15	202	3	strategy	Lkotlinx/serialization/json/JsonNamingStrategy;
/*     */     //   24	193	4	baseName	Ljava/lang/String;
/*     */     //   71	146	5	deserializationNamesMap	Ljava/util/Map;
/*     */     //   207	10	6	fallbackName	Ljava/lang/String;
/*     */     //   0	217	0	this	Lkotlinx/serialization/json/internal/JsonTreeDecoder;
/*     */     //   0	217	1	descriptor	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   0	217	2	index	I
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
/*     */   @NotNull
/*     */   protected JsonElement currentElement(@NotNull String tag) {
/* 258 */     Intrinsics.checkNotNullParameter(tag, "tag"); return (JsonElement)MapsKt.getValue((Map)getValue(), tag);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
/* 263 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); if (descriptor == this.polyDescriptor) {
/*     */       
/* 265 */       JsonTreeDecoder jsonTreeDecoder = this; JsonElement jsonElement = currentObject(); SerialDescriptor descriptor$iv = this.polyDescriptor; int $i$f$cast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 371 */       String serialName$iv$iv = descriptor$iv.getSerialName(); int i = 0;
/* 372 */       if (!(jsonElement instanceof JsonObject)) {
/*     */ 
/*     */         
/* 375 */         StringBuilder stringBuilder = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: "); byte b = -1; int $i$a$-cast-AbstractJsonTreeDecoder$cast$1$iv = 0; String str = AbstractJsonTreeDecoder.access$renderTagStack(jsonTreeDecoder); throw JsonExceptionsKt.JsonDecodingException(b, stringBuilder.append(str).toString(), 
/* 376 */             (CharSequence)jsonElement.toString());
/*     */       } 
/*     */       
/* 379 */       return (CompositeDecoder)new JsonTreeDecoder(getJson(), (JsonObject)jsonElement, getPolymorphicDiscriminator(), this.polyDescriptor);
/*     */     } 
/*     */     return super.beginStructure(descriptor);
/*     */   }
/*     */   
/*     */   public void endStructure(@NotNull SerialDescriptor descriptor) {
/*     */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*     */     if (JsonNamesMapKt.ignoreUnknownKeys(descriptor, getJson()) || descriptor.getKind() instanceof kotlinx.serialization.descriptors.PolymorphicKind)
/*     */       return; 
/*     */     JsonNamingStrategy strategy = JsonNamesMapKt.namingStrategy(descriptor, getJson());
/*     */     (Map)JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, (DescriptorSchemaCache.Key)JsonNamesMapKt.getJsonDeserializationNamesKey());
/*     */     if ((((Map)JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, (DescriptorSchemaCache.Key)JsonNamesMapKt.getJsonDeserializationNamesKey()) != null) ? ((Map)JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, (DescriptorSchemaCache.Key)JsonNamesMapKt.getJsonDeserializationNamesKey())).keySet() : null) == null)
/*     */       ((Map)JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, (DescriptorSchemaCache.Key)JsonNamesMapKt.getJsonDeserializationNamesKey()) != null) ? ((Map)JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, (DescriptorSchemaCache.Key)JsonNamesMapKt.getJsonDeserializationNamesKey())).keySet() : null; 
/*     */     Set names = (strategy == null && !this.configuration.getUseAlternativeNames()) ? JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor) : ((strategy != null) ? JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor).keySet() : SetsKt.plus(((Map)JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, (DescriptorSchemaCache.Key)JsonNamesMapKt.getJsonDeserializationNamesKey()) != null) ? ((Map)JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, (DescriptorSchemaCache.Key)JsonNamesMapKt.getJsonDeserializationNamesKey())).keySet() : null, SetsKt.emptySet()));
/*     */     for (String key : getValue().keySet()) {
/*     */       if (!names.contains(key) && !Intrinsics.areEqual(key, getPolymorphicDiscriminator()))
/*     */         throw JsonExceptionsKt.JsonDecodingException(-1, "Encountered an unknown key '" + key + "' at element: " + renderTagStack() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + JsonExceptionsKt.minify$default((CharSequence)getValue().toString(), 0, 1, null)); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonTreeDecoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */