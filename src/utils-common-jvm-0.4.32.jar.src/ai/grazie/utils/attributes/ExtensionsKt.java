/*     */ package ai.grazie.utils.attributes;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\0008\n\000\n\002\030\002\n\000\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\032\020\020\000\032\004\030\0010\0012\006\020\002\032\0020\003\032\035\020\002\032\004\030\001H\004\"\004\b\000\020\0042\b\020\002\032\004\030\0010\001¢\006\002\020\005\032\"\020\006\032\022\022\004\022\0020\0010\007j\b\022\004\022\0020\001`\b*\0020\t2\006\020\n\032\0020\013\032\n\020\f\032\0020\r*\0020\016\032\032\020\017\032\006\022\002\b\0030\020*\016\022\002\b\003\022\002\b\003\022\002\b\0030\021¨\006\022"}, d2 = {"toAttributeValue", "Lai/grazie/utils/attributes/Attributes$Value;", "value", "", "T", "(Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Object;", "getComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Lai/grazie/utils/attributes/Attributes$Companion;", "key", "Lai/grazie/utils/attributes/Attributes$Key;", "toDataHolder", "Lai/grazie/utils/data/DataHolder;", "Lai/grazie/utils/attributes/Attributes;", "toValueDescriptor", "Lai/grazie/utils/data/ValueDescriptor;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "utils-common"})
/*     */ @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nai/grazie/utils/attributes/ExtensionsKt\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n28#2:104\n1#3:105\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nai/grazie/utils/attributes/ExtensionsKt\n*L\n81#1:104\n*E\n"})
/*     */ public final class ExtensionsKt {
/*     */   @NotNull
/*     */   public static final Comparator<Attributes.Value> getComparator(@NotNull Attributes.Companion $this$getComparator, @NotNull Attributes.Key key) {
/*   8 */     Intrinsics.checkNotNullParameter($this$getComparator, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); Attributes.Key key1 = key;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  19 */     if (key1 instanceof Attributes.Key.Text) {  } else { throw new IllegalStateException(("Got non comparable key " + 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  24 */           Reflection.getOrCreateKotlinClass(key.getClass()) + " with fqdn " + key).toString()); }
/*     */     
/*     */     return (key1 instanceof Attributes.Key.Long) ? ExtensionsKt::getComparator$lambda$1 : ((key1 instanceof Attributes.Key.Double) ? ExtensionsKt::getComparator$lambda$3 : (Comparator<Attributes.Value>)"JD-Core does not support Kotlin");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final int getComparator$lambda$1(Attributes.Value a, Attributes.Value b) {
/*     */     if (!((a instanceof Attributes.Value.Long && b instanceof Attributes.Value.Long) ? 1 : 0))
/* 105 */     { int $i$a$-require-ExtensionsKt$getComparator$1$1 = 0; String str = "Unexpected type of value"; throw new IllegalArgumentException(str.toString()); }  return Intrinsics.compare(((Attributes.Value.Long)a).getValue().longValue(), ((Attributes.Value.Long)b).getValue().longValue()); } private static final int getComparator$lambda$3(Attributes.Value a, Attributes.Value b) { if (!((a instanceof Attributes.Value.Double && b instanceof Attributes.Value.Double) ? 1 : 0)) { int $i$a$-require-ExtensionsKt$getComparator$2$1 = 0; String str = "Unexpected type of value"; throw new IllegalArgumentException(str.toString()); }  return Double.compare(((Attributes.Value.Double)a).getValue().doubleValue(), ((Attributes.Value.Double)b).getValue().doubleValue()); } private static final int getComparator$lambda$5(Attributes.Value a, Attributes.Value b) { if (!((a instanceof Attributes.Value.Text && b instanceof Attributes.Value.Text) ? 1 : 0)) { int $i$a$-require-ExtensionsKt$getComparator$3$1 = 0;
/*     */       String str = "Unexpected type of value";
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/*     */     return ((Attributes.Value.Text)a).getValue().compareTo(((Attributes.Value.Text)b).getValue()); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final DataHolder toDataHolder(@NotNull Attributes $this$toDataHolder) {
/*     */     Intrinsics.checkNotNullParameter($this$toDataHolder, "<this>");
/*     */     return DataHolder.Companion.build(new ExtensionsKt$toDataHolder$1($this$toDataHolder));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/data/DataHolderBuilder;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nai/grazie/utils/attributes/ExtensionsKt$toDataHolder$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,103:1\n1863#2:104\n1864#2:107\n1#3:105\n28#4:106\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nai/grazie/utils/attributes/ExtensionsKt$toDataHolder$1\n*L\n29#1:104\n29#1:107\n53#1:106\n*E\n"})
/*     */   static final class ExtensionsKt$toDataHolder$1 extends Lambda implements Function1<DataHolderBuilder, Unit> {
/*     */     public final void invoke(DataHolderBuilder $this$build) {
/*     */       Intrinsics.checkNotNullParameter($this$build, "$this$build");
/*     */       Iterable $this$forEach$iv = this.$this_toDataHolder;
/*     */       int $i$f$forEach = 0;
/*     */       Iterator iterator = $this$forEach$iv.iterator();
/*     */       if (iterator.hasNext()) {
/*     */         Object element$iv = iterator.next();
/*     */         Map.Entry entry = (Map.Entry)element$iv;
/*     */         int $i$a$-forEach-ExtensionsKt$toDataHolder$1$1 = 0;
/*     */         Attributes.Key k = (Attributes.Key)entry.getKey();
/*     */         Attributes.Value v = (Attributes.Value)entry.getValue();
/*     */         Attributes.Value value1 = v;
/*     */       } 
/*     */     }
/*     */     
/*     */     ExtensionsKt$toDataHolder$1(Attributes $receiver) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ValueDescriptor<?> toValueDescriptor(@NotNull AttributeDescriptor $this$toValueDescriptor) {
/*     */     Intrinsics.checkNotNullParameter($this$toValueDescriptor, "<this>");
/*     */     AttributeDescriptor attributeDescriptor = $this$toValueDescriptor;
/*     */     if (attributeDescriptor instanceof AttributeDescriptor.RawJson) {
/*     */     
/*     */     } else {
/*     */       throw new IllegalArgumentException("Unknown attribute descriptor " + $this$toValueDescriptor);
/*     */     } 
/*     */     return (attributeDescriptor instanceof AttributeDescriptor.Int) ? (ValueDescriptor)new ValueDescriptor.Int($this$toValueDescriptor.getName(), false, 2, null) : ((attributeDescriptor instanceof AttributeDescriptor.OptInt) ? (ValueDescriptor)new ValueDescriptor.Int($this$toValueDescriptor.getName(), true) : ((attributeDescriptor instanceof AttributeDescriptor.Bool) ? (ValueDescriptor)new ValueDescriptor.Bool($this$toValueDescriptor.getName(), false, 2, null) : ((attributeDescriptor instanceof AttributeDescriptor.OptBool) ? (ValueDescriptor)new ValueDescriptor.Bool($this$toValueDescriptor.getName(), true) : ((attributeDescriptor instanceof AttributeDescriptor.Text) ? (ValueDescriptor)new ValueDescriptor.Text($this$toValueDescriptor.getName(), false, 2, null) : ((attributeDescriptor instanceof AttributeDescriptor.OptText) ? (ValueDescriptor)new ValueDescriptor.Text($this$toValueDescriptor.getName(), true) : ((attributeDescriptor instanceof AttributeDescriptor.Json) ? (ValueDescriptor)new ValueDescriptor.Json($this$toValueDescriptor.getName(), false, 2, null) : ((attributeDescriptor instanceof AttributeDescriptor.OptRawJson) ? (ValueDescriptor)new ValueDescriptor.Json($this$toValueDescriptor.getName(), true) : (ValueDescriptor<?>)"JD-Core does not support Kotlin")))))));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Attributes.Value toAttributeValue(@NotNull Object value) {
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     Object object1 = value;
/*     */     JSON jSON = (JSON)JSON.Default.INSTANCE;
/*     */     Object value$iv = value;
/*     */     int $i$f$string = 0;
/*     */     return (object1 instanceof Integer) ? new Attributes.Value.Long(((Number)value).intValue(), null, 2, null) : ((object1 instanceof Boolean) ? new Attributes.Value.Bool(((Boolean)value).booleanValue(), null, 2, null) : ((object1 instanceof JsonElement) ? new Attributes.Value.Json(jSON.string((SerializationStrategy)JsonElement.Companion.serializer(), value$iv), null, 2, null) : ((object1 instanceof String) ? new Attributes.Value.Text((String)value, null, 2, null) : null)));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final <T> T value(@Nullable Attributes.Value value) {
/*     */     Attributes.Value it = value;
/*     */     int $i$a$-let-ExtensionsKt$value$1 = 0;
/*     */     Attributes.Value value1 = value;
/*     */     JsonElement jsonElement = JSON.Default.INSTANCE.parseJsonElement(((Attributes.Value.Json)value).getValue());
/*     */     if (value1 instanceof Attributes.Value.Text) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return (value != null) ? ((value1 instanceof Attributes.Value.Json) ? (T)jsonElement : ((value1 instanceof Attributes.Value.Bool) ? (T)((Attributes.Value.Bool)value).getValue() : ((value1 instanceof Attributes.Value.Bytes) ? null : ((value1 instanceof Attributes.Value.Double) ? null : ((value1 instanceof Attributes.Value.Long) ? (T)Integer.valueOf((int)((Attributes.Value.Long)value).getValue().longValue()) : (T)"JD-Core does not support Kotlin"))))) : null;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */