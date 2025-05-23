/*    */ package org.jetbrains.jewel.bridge.actionSystem;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\000\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\000\b\001\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J)\020\006\032\0020\007\"\b\b\000\020\b*\0020\t2\006\020\n\032\0020\0132\b\020\f\032\004\030\001H\bH\026¢\006\002\020\rJ*\020\016\032\0020\007\"\b\b\000\020\b*\0020\t2\006\020\n\032\0020\0132\016\020\017\032\n\022\006\022\004\030\001H\b0\020H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\021"}, d2 = {"Lorg/jetbrains/jewel/bridge/actionSystem/DataProviderDataSinkContext;", "Lorg/jetbrains/jewel/foundation/actionSystem/DataProviderContext;", "dataSink", "Lcom/intellij/openapi/actionSystem/DataSink;", "<init>", "(Lcom/intellij/openapi/actionSystem/DataSink;)V", "set", "", "TValue", "", "key", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "lazy", "initializer", "Lkotlin/Function0;", "ide-laf-bridge"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class DataProviderDataSinkContext implements DataProviderContext { @NotNull
/*    */   private final DataSink dataSink;
/*    */   
/*    */   public DataProviderDataSinkContext(@NotNull DataSink dataSink) {
/*  7 */     this.dataSink = dataSink;
/*    */   } public static final int $stable = 8; public <TValue> void set(@NotNull String key, @Nullable Object value) {
/*  9 */     Intrinsics.checkNotNullParameter(key, "key"); DataKey ijKey = DataKey.Companion.create(key);
/* 10 */     if (value == null) {
/* 11 */       this.dataSink.setNull(ijKey);
/*    */     }
/* 13 */     this.dataSink.set(ijKey, value);
/*    */   }
/*    */   
/*    */   public <TValue> void lazy(@NotNull String key, @NotNull Function0 initializer) {
/* 17 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(initializer, "initializer"); DataKey ijKey = DataKey.Companion.create(key);
/* 18 */     this.dataSink.lazy(ijKey, initializer);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\actionSystem\DataProviderDataSinkContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */