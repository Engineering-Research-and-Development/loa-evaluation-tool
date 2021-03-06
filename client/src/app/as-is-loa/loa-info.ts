export class LoaInfo {

    private _cognitiveLoa;
    private _physicalLoa;

    public constructor(
        rawLoaInfo: any,
        rawLoaInfoCognitive: any
    ) {
        if (rawLoaInfoCognitive == null) {
            this._cognitiveLoa = rawLoaInfo.fkTbAceCogLoa;
            this._physicalLoa = rawLoaInfo.fkTbAcePhyLoa;
        } else {
            this._cognitiveLoa = rawLoaInfoCognitive.fkTbAceCogLoa;
            this._physicalLoa = rawLoaInfo.fkTbAcePhyLoa;
        }
    }

    get cognitiveLoa() {
        return this._cognitiveLoa;
    }

    get physicalLoa() {
        return this._physicalLoa;
    }

    public valueOf() {
        return "" + this._cognitiveLoa + this._physicalLoa;
    }

    public static valueOfInverse(primitive: String) {
        return new LoaInfo({
            fkTbAceCogLoa: primitive.charAt(0),
            fkTbAcePhyLoa: primitive.charAt(1)
        }, null);
    }

}