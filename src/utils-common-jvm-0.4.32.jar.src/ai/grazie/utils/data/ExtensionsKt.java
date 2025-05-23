/*    */ package ai.grazie.utils.data;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\032\032\020\000\032\016\022\002\b\003\022\002\b\003\022\002\b\0030\001*\006\022\002\b\0030\002\032\n\020\003\032\0020\004*\0020\005¨\006\006"}, d2 = {"toAttributeDescriptor", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/data/ValueDescriptor;", "toAttributes", "Lai/grazie/utils/attributes/Attributes;", "Lai/grazie/utils/data/DataHolder;", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nai/grazie/utils/data/ExtensionsKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,47:1\n216#2:48\n217#2:50\n28#3:49\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nai/grazie/utils/data/ExtensionsKt\n*L\n21#1:48\n21#1:50\n41#1:49\n*E\n"})
/*    */ public final class ExtensionsKt {
/*    */   @NotNull
/*    */   public static final AttributeDescriptor<?, ?, ?> toAttributeDescriptor(@NotNull ValueDescriptor $this$toAttributeDescriptor) {
/*  9 */     Intrinsics.checkNotNullParameter($this$toAttributeDescriptor, "<this>"); boolean isOptional = $this$toAttributeDescriptor.getOptional();
/* 10 */     ValueDescriptor valueDescriptor = $this$toAttributeDescriptor;
/*    */ 
/*    */ 
/*    */     
/* 14 */     if (valueDescriptor instanceof ValueDescriptor.Text) {  } else { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (valueDescriptor instanceof ValueDescriptor.Int) ? (isOptional ? (AttributeDescriptor<?, ?, ?>)new AttributeDescriptor.OptInt($this$toAttributeDescriptor.getName()) : (AttributeDescriptor<?, ?, ?>)new AttributeDescriptor.Int($this$toAttributeDescriptor.getName())) : ((valueDescriptor instanceof ValueDescriptor.Bool) ? (isOptional ? (AttributeDescriptor<?, ?, ?>)new AttributeDescriptor.OptBool($this$toAttributeDescriptor.getName()) : (AttributeDescriptor<?, ?, ?>)new AttributeDescriptor.Bool($this$toAttributeDescriptor.getName())) : ((valueDescriptor instanceof ValueDescriptor.Json) ? (isOptional ? (AttributeDescriptor<?, ?, ?>)new AttributeDescriptor.OptRawJson($this$toAttributeDescriptor.getName()) : (AttributeDescriptor<?, ?, ?>)new AttributeDescriptor.RawJson($this$toAttributeDescriptor.getName())) : (AttributeDescriptor<?, ?, ?>)"JD-Core does not support Kotlin"));
/*    */   } @NotNull
/*    */   public static final Attributes toAttributes(@NotNull DataHolder $this$toAttributes) {
/* 19 */     Intrinsics.checkNotNullParameter($this$toAttributes, "<this>"); Map<Object, Object> map = new LinkedHashMap<>();
/*    */     
/* 21 */     Map $this$forEach$iv = $this$toAttributes; int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 48 */     Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-ExtensionsKt$toAttributes$1 = 0;
/*    */       String key = (String)entry1.getKey();
/*    */       JsonElement parameter = (JsonElement)entry1.getValue(); }
/*    */     
/*    */     return Attributes.Companion.invoke(map);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\data\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */