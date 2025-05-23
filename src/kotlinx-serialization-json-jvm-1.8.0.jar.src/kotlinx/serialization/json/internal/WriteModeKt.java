/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.descriptors.ContextAwareKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.descriptors.SerialKind;
/*    */ import kotlinx.serialization.descriptors.StructureKind;
/*    */ import kotlinx.serialization.json.Json;
/*    */ import kotlinx.serialization.modules.SerializersModule;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\004\n\002\030\002\n\000\032\024\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\000\032S\020\005\032\002H\006\"\004\b\000\020\006\"\b\b\001\020\007*\002H\006\"\b\b\002\020\b*\002H\006*\0020\0022\006\020\t\032\0020\0042\f\020\n\032\b\022\004\022\002H\0070\0132\f\020\f\032\b\022\004\022\002H\b0\013H\bø\001\000¢\006\002\020\r\032\024\020\016\032\0020\004*\0020\0042\006\020\017\032\0020\020H\000\002\007\n\005\b20\001¨\006\021"}, d2 = {"switchMode", "Lkotlinx/serialization/json/internal/WriteMode;", "Lkotlinx/serialization/json/Json;", "desc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "selectMapMode", "T", "R1", "R2", "mapDescriptor", "ifMap", "Lkotlin/Function0;", "ifList", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "carrierDescriptor", "module", "Lkotlinx/serialization/modules/SerializersModule;", "kotlinx-serialization-json"})
/*    */ @SourceDebugExtension({"SMAP\nWriteMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,53:1\n36#1,9:54\n*S KotlinDebug\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n26#1:54,9\n*E\n"})
/*    */ public final class WriteModeKt
/*    */ {
/*    */   @NotNull
/*    */   public static final WriteMode switchMode(@NotNull Json $this$switchMode, @NotNull SerialDescriptor desc) {
/* 23 */     Intrinsics.checkNotNullParameter($this$switchMode, "<this>"); Intrinsics.checkNotNullParameter(desc, "desc"); SerialKind serialKind = desc.getKind();
/*    */ 
/*    */     
/* 26 */     if (Intrinsics.areEqual(serialKind, StructureKind.MAP.INSTANCE)) { Json $this$selectMapMode$iv = $this$switchMode; int $i$f$selectMapMode = 0;
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
/* 54 */       SerialDescriptor keyDescriptor$iv = carrierDescriptor(desc.getElementDescriptor(0), $this$selectMapMode$iv.getSerializersModule());
/* 55 */       SerialKind keyKind$iv = keyDescriptor$iv.getKind();
/*    */       
/* 57 */       if (keyKind$iv instanceof kotlinx.serialization.descriptors.PrimitiveKind || Intrinsics.areEqual(keyKind$iv, SerialKind.ENUM.INSTANCE))
/* 58 */         int $i$a$-selectMapMode-WriteModeKt$switchMode$1 = 0; 
/* 59 */       if ($this$selectMapMode$iv.getConfiguration().getAllowStructuredMapKeys()) {
/* 60 */         int $i$a$-selectMapMode-WriteModeKt$switchMode$2 = 0;
/*    */       }
/* 62 */       throw JsonExceptionsKt.InvalidKeyKindException(keyDescriptor$iv); }
/*    */     
/*    */     return (serialKind instanceof kotlinx.serialization.descriptors.PolymorphicKind) ? WriteMode.POLY_OBJ : (Intrinsics.areEqual(serialKind, StructureKind.LIST.INSTANCE) ? WriteMode.LIST : WriteMode.OBJ);
/*    */   }
/*    */   
/*    */   public static final <T, R1 extends T, R2 extends T> T selectMapMode(@NotNull Json $this$selectMapMode, @NotNull SerialDescriptor mapDescriptor, @NotNull Function0 ifMap, @NotNull Function0 ifList) {
/*    */     Intrinsics.checkNotNullParameter($this$selectMapMode, "<this>");
/*    */     Intrinsics.checkNotNullParameter(mapDescriptor, "mapDescriptor");
/*    */     Intrinsics.checkNotNullParameter(ifMap, "ifMap");
/*    */     Intrinsics.checkNotNullParameter(ifList, "ifList");
/*    */     int $i$f$selectMapMode = 0;
/*    */     SerialDescriptor keyDescriptor = carrierDescriptor(mapDescriptor.getElementDescriptor(0), $this$selectMapMode.getSerializersModule());
/*    */     SerialKind keyKind = keyDescriptor.getKind();
/*    */     if ($this$selectMapMode.getConfiguration().getAllowStructuredMapKeys()) {
/*    */     
/*    */     } else {
/*    */       throw JsonExceptionsKt.InvalidKeyKindException(keyDescriptor);
/*    */     } 
/*    */     return (keyKind instanceof kotlinx.serialization.descriptors.PrimitiveKind || Intrinsics.areEqual(keyKind, SerialKind.ENUM.INSTANCE)) ? (T)ifMap.invoke() : (T)"JD-Core does not support Kotlin";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final SerialDescriptor carrierDescriptor(@NotNull SerialDescriptor $this$carrierDescriptor, @NotNull SerializersModule module) {
/*    */     Intrinsics.checkNotNullParameter($this$carrierDescriptor, "<this>");
/*    */     Intrinsics.checkNotNullParameter(module, "module");
/*    */     if (Intrinsics.areEqual($this$carrierDescriptor.getKind(), SerialKind.CONTEXTUAL.INSTANCE)) {
/*    */       if (ContextAwareKt.getContextualDescriptor(module, $this$carrierDescriptor) == null || carrierDescriptor(ContextAwareKt.getContextualDescriptor(module, $this$carrierDescriptor), module) == null)
/*    */         carrierDescriptor(ContextAwareKt.getContextualDescriptor(module, $this$carrierDescriptor), module); 
/*    */     } else {
/*    */     
/*    */     } 
/*    */     return $this$carrierDescriptor.isInline() ? carrierDescriptor($this$carrierDescriptor.getElementDescriptor(0), module) : $this$carrierDescriptor;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\WriteModeKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */