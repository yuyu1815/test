/*    */ package ai.grazie.utils.attributes;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\025\b'\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\004*\004\b\002\020\0052\0020\006:\t\026\027\030\031\032\033\034\035\036B\025\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013J\r\020\020\032\0028\000H&¢\006\002\020\021J\025\020\022\032\0028\0022\006\020\023\032\0020\004H\026¢\006\002\020\024J\027\020\023\032\004\030\0018\0012\006\020\023\032\0028\002H&¢\006\002\020\025R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\f\020\rR\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\016\020\017¨\006\037"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor;", "K", "Lai/grazie/utils/attributes/Attributes$Key;", "V", "Lai/grazie/utils/attributes/Attributes$Value;", "T", "", "name", "", "optional", "", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getOptional", "()Z", "key", "()Lai/grazie/utils/attributes/Attributes$Key;", "unwrap", "value", "(Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Object;", "(Ljava/lang/Object;)Lai/grazie/utils/attributes/Attributes$Value;", "Bool", "Int", "Json", "OptBool", "OptInt", "OptRawJson", "OptText", "RawJson", "Text", "utils-common"})
/*    */ public abstract class AttributeDescriptor<K extends Attributes.Key, V extends Attributes.Value, T> { @NotNull
/*    */   private final String name;
/*    */   private final boolean optional;
/*    */   
/*  6 */   public AttributeDescriptor(@NotNull String name, boolean optional) { this.name = name; this.optional = optional; } @NotNull public final String getName() { return this.name; } public final boolean getOptional() { return this.optional; }
/*    */    @NotNull
/*    */   public abstract K key(); @Nullable
/*    */   public abstract V value(T paramT);
/*    */   public T unwrap(@NotNull Attributes.Value value) {
/* 11 */     Intrinsics.checkNotNullParameter(value, "value"); return Attributes.Companion.unwrap((Attributes.Key)key(), value);
/*    */   }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\005\030\0002\024\022\004\022\0020\002\022\004\022\0020\003\022\004\022\0020\0040\001B\r\022\006\020\005\032\0020\004¢\006\002\020\006J\b\020\007\032\0020\002H\026J\020\020\b\032\0020\0032\006\020\b\032\0020\004H\026¨\006\t"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "Lai/grazie/utils/attributes/Attributes$Value$Text;", "", "name", "(Ljava/lang/String;)V", "key", "value", "utils-common"})
/* 14 */   public static final class Text extends AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, String> { public Text(@NotNull String name) { super(name, false); } @NotNull
/* 15 */     public Attributes.Key.Text key() { return new Attributes.Key.Text(getName(), null, 2, null); } @NotNull
/* 16 */     public Attributes.Value.Text value(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); return new Attributes.Value.Text(value, null, 2, null); } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\005\030\0002\026\022\004\022\0020\002\022\004\022\0020\003\022\006\022\004\030\0010\0040\001B\r\022\006\020\005\032\0020\004¢\006\002\020\006J\b\020\007\032\0020\002H\026J\024\020\b\032\004\030\0010\0032\b\020\b\032\004\030\0010\004H\026¨\006\t"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "Lai/grazie/utils/attributes/Attributes$Value$Text;", "", "name", "(Ljava/lang/String;)V", "key", "value", "utils-common"})
/*    */   @SourceDebugExtension({"SMAP\nAttributeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeDescriptor.kt\nai/grazie/utils/attributes/AttributeDescriptor$OptText\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
/* 19 */   public static final class OptText extends AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, String> { public OptText(@NotNull String name) { super(name, true); } @NotNull
/* 20 */     public Attributes.Key.Text key() { return new Attributes.Key.Text(getName(), null, 2, null); } @Nullable
/* 21 */     public Attributes.Value.Text value(@Nullable String value) { String it = value;
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
/* 85 */       int $i$a$-let-AttributeDescriptor$OptText$value$1 = 0; return (value != null) ? new Attributes.Value.Text(value, null, 2, null) : null; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\002\030\0002\024\022\004\022\0020\002\022\004\022\0020\003\022\004\022\0020\0040\001B\r\022\006\020\005\032\0020\006¢\006\002\020\007J\b\020\b\032\0020\002H\026J\025\020\t\032\0020\0042\006\020\n\032\0020\013H\026¢\006\002\020\fJ\020\020\n\032\0020\0032\006\020\n\032\0020\004H\026¨\006\r"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$Int;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "Lai/grazie/utils/attributes/Attributes$Value$Long;", "", "name", "", "(Ljava/lang/String;)V", "key", "unwrap", "value", "Lai/grazie/utils/attributes/Attributes$Value;", "(Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Integer;", "utils-common"}) public static final class Int extends AttributeDescriptor<Attributes.Key.Long, Attributes.Value.Long, Integer> { public Int(@NotNull String name) { super(name, false); } @NotNull public Attributes.Key.Long key() { return new Attributes.Key.Long(getName()); } @NotNull public Attributes.Value.Long value(int value) { return new Attributes.Value.Long(value, null, 2, null); } @NotNull public Integer unwrap(@NotNull Attributes.Value value) { Intrinsics.checkNotNullParameter(value, "value"); return Integer.valueOf((int)((Number)Attributes.Companion.<Number>unwrap(key(), value)).longValue()); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\003\030\0002\026\022\004\022\0020\002\022\004\022\0020\003\022\006\022\004\030\0010\0040\001B\r\022\006\020\005\032\0020\006¢\006\002\020\007J\b\020\b\032\0020\002H\026J\025\020\t\032\0020\0042\006\020\n\032\0020\013H\026¢\006\002\020\fJ\031\020\n\032\004\030\0010\0032\b\020\n\032\004\030\0010\004H\026¢\006\002\020\r¨\006\016"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$OptInt;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "Lai/grazie/utils/attributes/Attributes$Value$Long;", "", "name", "", "(Ljava/lang/String;)V", "key", "unwrap", "value", "Lai/grazie/utils/attributes/Attributes$Value;", "(Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lai/grazie/utils/attributes/Attributes$Value$Long;", "utils-common"}) @SourceDebugExtension({"SMAP\nAttributeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeDescriptor.kt\nai/grazie/utils/attributes/AttributeDescriptor$OptInt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"}) public static final class OptInt extends AttributeDescriptor<Attributes.Key.Long, Attributes.Value.Long, Integer> { public OptInt(@NotNull String name) { super(name, true); } @NotNull public Attributes.Key.Long key() { return new Attributes.Key.Long(getName()); } @Nullable public Attributes.Value.Long value(@Nullable Integer value) { int it = value.intValue(); int $i$a$-let-AttributeDescriptor$OptInt$value$1 = 0; return (value != null) ? new Attributes.Value.Long(value.intValue(), null, 2, null) : null; } @NotNull public Integer unwrap(@NotNull Attributes.Value value) { Intrinsics.checkNotNullParameter(value, "value"); return Integer.valueOf((int)((Number)Attributes.Companion.<Number>unwrap(key(), value)).longValue()); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\003\030\0002\026\022\004\022\0020\002\022\004\022\0020\003\022\006\022\004\030\0010\0040\001B\r\022\006\020\005\032\0020\006¢\006\002\020\007J\b\020\b\032\0020\002H\026J\025\020\t\032\0020\0042\006\020\n\032\0020\013H\026¢\006\002\020\fJ\031\020\n\032\004\030\0010\0032\b\020\n\032\004\030\0010\004H\026¢\006\002\020\r¨\006\016"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$OptBool;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "Lai/grazie/utils/attributes/Attributes$Value$Bool;", "", "name", "", "(Ljava/lang/String;)V", "key", "unwrap", "value", "Lai/grazie/utils/attributes/Attributes$Value;", "(Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lai/grazie/utils/attributes/Attributes$Value$Bool;", "utils-common"}) @SourceDebugExtension({"SMAP\nAttributeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeDescriptor.kt\nai/grazie/utils/attributes/AttributeDescriptor$OptBool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"}) public static final class OptBool extends AttributeDescriptor<Attributes.Key.Bool, Attributes.Value.Bool, Boolean> { public OptBool(@NotNull String name) { super(name, true); } @NotNull public Attributes.Key.Bool key() { return new Attributes.Key.Bool(getName()); } @Nullable public Attributes.Value.Bool value(@Nullable Boolean value) { boolean it = value.booleanValue(); int $i$a$-let-AttributeDescriptor$OptBool$value$1 = 0; return (value != null) ? new Attributes.Value.Bool(value.booleanValue(), null, 2, null) : null; } @NotNull public Boolean unwrap(@NotNull Attributes.Value value) { Intrinsics.checkNotNullParameter(value, "value"); return Attributes.Companion.<Boolean>unwrap(key(), value); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\002\030\0002\024\022\004\022\0020\002\022\004\022\0020\003\022\004\022\0020\0040\001B\r\022\006\020\005\032\0020\006¢\006\002\020\007J\b\020\b\032\0020\002H\026J\025\020\t\032\0020\0042\006\020\n\032\0020\013H\026¢\006\002\020\fJ\020\020\n\032\0020\0032\006\020\n\032\0020\004H\026¨\006\r"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$Bool;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "Lai/grazie/utils/attributes/Attributes$Value$Bool;", "", "name", "", "(Ljava/lang/String;)V", "key", "unwrap", "value", "Lai/grazie/utils/attributes/Attributes$Value;", "(Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Boolean;", "utils-common"}) public static final class Bool extends AttributeDescriptor<Attributes.Key.Bool, Attributes.Value.Bool, Boolean> { public Bool(@NotNull String name) { super(name, false); } @NotNull public Attributes.Key.Bool key() { return new Attributes.Key.Bool(getName()); } @NotNull public Attributes.Value.Bool value(boolean value) { return new Attributes.Value.Bool(value, null, 2, null); } @NotNull public Boolean unwrap(@NotNull Attributes.Value value) { Intrinsics.checkNotNullParameter(value, "value"); return Attributes.Companion.<Boolean>unwrap(key(), value); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\005\n\002\030\002\n\000\030\0002\024\022\004\022\0020\002\022\004\022\0020\003\022\004\022\0020\0040\001B\r\022\006\020\005\032\0020\004¢\006\002\020\006J\b\020\007\032\0020\002H\026J\020\020\b\032\0020\0042\006\020\t\032\0020\nH\026J\020\020\t\032\0020\0032\006\020\t\032\0020\004H\026¨\006\013"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$RawJson;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "Lai/grazie/utils/attributes/Attributes$Value$Json;", "", "name", "(Ljava/lang/String;)V", "key", "unwrap", "value", "Lai/grazie/utils/attributes/Attributes$Value;", "utils-common"}) public static final class RawJson extends AttributeDescriptor<Attributes.Key.Json, Attributes.Value.Json, String> { public RawJson(@NotNull String name) { super(name, false); } @NotNull public Attributes.Key.Json key() { return new Attributes.Key.Json(getName(), null, 2, null); } @NotNull public Attributes.Value.Json value(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); return new Attributes.Value.Json(value, null, 2, null); } @NotNull public String unwrap(@NotNull Attributes.Value value) { Intrinsics.checkNotNullParameter(value, "value"); return Attributes.Companion.<String>unwrap(key(), value); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\005\n\002\030\002\n\000\030\0002\026\022\004\022\0020\002\022\004\022\0020\003\022\006\022\004\030\0010\0040\001B\r\022\006\020\005\032\0020\004¢\006\002\020\006J\b\020\007\032\0020\002H\026J\020\020\b\032\0020\0042\006\020\t\032\0020\nH\026J\024\020\t\032\004\030\0010\0032\b\020\t\032\004\030\0010\004H\026¨\006\013"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$OptRawJson;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "Lai/grazie/utils/attributes/Attributes$Value$Json;", "", "name", "(Ljava/lang/String;)V", "key", "unwrap", "value", "Lai/grazie/utils/attributes/Attributes$Value;", "utils-common"}) @SourceDebugExtension({"SMAP\nAttributeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeDescriptor.kt\nai/grazie/utils/attributes/AttributeDescriptor$OptRawJson\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"}) public static final class OptRawJson extends AttributeDescriptor<Attributes.Key.Json, Attributes.Value.Json, String> { public OptRawJson(@NotNull String name) { super(name, true); } @Nullable public Attributes.Value.Json value(@Nullable String value) { String it = value; int $i$a$-let-AttributeDescriptor$OptRawJson$value$1 = 0; return (value != null) ? new Attributes.Value.Json(value, null, 2, null) : null; } @NotNull public Attributes.Key.Json key() { return new Attributes.Key.Json(getName(), null, 2, null); } @NotNull public String unwrap(@NotNull Attributes.Value value) { Intrinsics.checkNotNullParameter(value, "value"); return Attributes.Companion.<String>unwrap(key(), value); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\b\n\002\030\002\n\002\b\003\b&\030\000*\004\b\003\020\0012\024\022\004\022\0020\003\022\004\022\0020\004\022\004\022\002H\0010\002B\025\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b¢\006\002\020\tJ\032\020\n\032\004\b\0028\0032\006\020\013\032\0020\006H$ø\001\000¢\006\002\020\fJ\006\020\r\032\0020\003J\032\020\016\032\0020\0062\b\020\013\032\004\b\0028\003H$ø\001\000¢\006\002\020\017J\023\020\020\032\0028\0032\006\020\013\032\0020\021¢\006\002\020\022J\025\020\013\032\004\030\0010\0042\006\020\013\032\0028\003¢\006\002\020\023\002\004\n\002\b9¨\006\024"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "T", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "Lai/grazie/utils/attributes/Attributes$Value$Json;", "name", "", "optional", "", "(Ljava/lang/String;Z)V", "fromJson", "value", "(Ljava/lang/String;)Ljava/lang/Object;", "key", "toJson", "(Ljava/lang/Object;)Ljava/lang/String;", "unwrap", "Lai/grazie/utils/attributes/Attributes$Value;", "(Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Object;", "(Ljava/lang/Object;)Lai/grazie/utils/attributes/Attributes$Value$Json;", "utils-common"}) @SourceDebugExtension({"SMAP\nAttributeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeDescriptor.kt\nai/grazie/utils/attributes/AttributeDescriptor$Json\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"}) public static abstract class Json<T> extends AttributeDescriptor<Attributes.Key.Json, Attributes.Value.Json, T> { public Json(@NotNull String name, boolean optional) { super(name, optional); } @NotNull public final Attributes.Key.Json key() { return new Attributes.Key.Json(getName(), null, 2, null); } @Nullable public final Attributes.Value.Json value(Object value) { Object it = value; int $i$a$-let-AttributeDescriptor$Json$value$1 = 0;
/*    */       return (value != null) ? new Attributes.Value.Json(toJson((T)value), null, 2, null) : null; }
/*    */ 
/*    */     
/*    */     public final T unwrap(@NotNull Attributes.Value value) {
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       if (!(value instanceof Attributes.Value.Json))
/*    */         throw new IllegalStateException(("Expected json for " + key() + " attribute").toString()); 
/*    */       return fromJson(((Attributes.Value.Json)value).getValue());
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     protected abstract String toJson(@NotNull T param1T);
/*    */     
/*    */     @NotNull
/*    */     protected abstract T fromJson(@NotNull String param1String); }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributeDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */