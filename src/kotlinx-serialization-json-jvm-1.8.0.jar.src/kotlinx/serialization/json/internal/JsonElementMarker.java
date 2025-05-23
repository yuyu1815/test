/*    */ package kotlinx.serialization.json.internal;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.internal.ElementMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\002\b\004\n\002\020\002\n\000\n\002\020\b\n\002\b\005\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\025\020\r\032\0020\0162\006\020\017\032\0020\020H\000¢\006\002\b\021J\r\020\022\032\0020\020H\000¢\006\002\b\023J\030\020\024\032\0020\t2\006\020\002\032\0020\0032\006\020\017\032\0020\020H\002R\016\020\006\032\0020\007X\004¢\006\002\n\000R\036\020\n\032\0020\t2\006\020\b\032\0020\t@BX\016¢\006\b\n\000\032\004\b\013\020\f¨\006\025"}, d2 = {"Lkotlinx/serialization/json/internal/JsonElementMarker;", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "origin", "Lkotlinx/serialization/internal/ElementMarker;", "value", "", "isUnmarkedNull", "isUnmarkedNull$kotlinx_serialization_json", "()Z", "mark", "", "index", "", "mark$kotlinx_serialization_json", "nextUnmarkedIndex", "nextUnmarkedIndex$kotlinx_serialization_json", "readIfAbsent", "kotlinx-serialization-json"})
/*    */ public final class JsonElementMarker {
/*    */   @NotNull
/*    */   private final ElementMarker origin;
/*    */   
/*    */   public JsonElementMarker(@NotNull SerialDescriptor descriptor) {
/* 14 */     this.origin = new ElementMarker(descriptor, new JsonElementMarker$origin$1(this));
/*    */   } private boolean isUnmarkedNull; public final boolean isUnmarkedNull$kotlinx_serialization_json() {
/* 16 */     return this.isUnmarkedNull;
/*    */   }
/*    */   
/*    */   public final void mark$kotlinx_serialization_json(int index) {
/* 20 */     this.origin.mark(index);
/*    */   }
/*    */   
/*    */   public final int nextUnmarkedIndex$kotlinx_serialization_json() {
/* 24 */     return this.origin.nextUnmarkedIndex();
/*    */   }
/*    */   
/*    */   private final boolean readIfAbsent(SerialDescriptor descriptor, int index) {
/* 28 */     this.isUnmarkedNull = (!descriptor.isElementOptional(index) && descriptor.getElementDescriptor(index).isNullable());
/* 29 */     return this.isUnmarkedNull;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonElementMarker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */