/*     */ package ai.grazie.utils.attributes;
/*     */ 
/*     */ import ai.grazie.utils.data.DataHolderBuilder;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/data/DataHolderBuilder;", "invoke"})
/*     */ @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nai/grazie/utils/attributes/ExtensionsKt$toDataHolder$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,103:1\n1863#2:104\n1864#2:107\n1#3:105\n28#4:106\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nai/grazie/utils/attributes/ExtensionsKt$toDataHolder$1\n*L\n29#1:104\n29#1:107\n53#1:106\n*E\n"})
/*     */ final class ExtensionsKt$toDataHolder$1
/*     */   extends Lambda
/*     */   implements Function1<DataHolderBuilder, Unit>
/*     */ {
/*     */   public final void invoke(DataHolderBuilder $this$build) {
/*  29 */     Intrinsics.checkNotNullParameter($this$build, "$this$build"); Iterable $this$forEach$iv = this.$this_toDataHolder; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Map.Entry entry = (Map.Entry)element$iv; int $i$a$-forEach-ExtensionsKt$toDataHolder$1$1 = 0;
/*     */       Attributes.Key k = (Attributes.Key)entry.getKey();
/*     */       Attributes.Value v = (Attributes.Value)entry.getValue();
/*     */       Attributes.Value value1 = v; }
/*     */   
/*     */   }
/*     */   
/*     */   ExtensionsKt$toDataHolder$1(Attributes $receiver) {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\ExtensionsKt$toDataHolder$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */